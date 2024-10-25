package main.cinemaproject.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import main.cinemaproject.model.Ticket;

public class TicketDAO implements ITicket {
    private Connection connection;
    public TicketDAO(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void addTicket(Ticket ticket) {
        String sql = "INSERT INTO tickets (customer_id, movie_id, screening_id, seat_number, price, purchase_date) VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setInt(1, ticket.getCustomerId());
            pstmt.setInt(2, ticket.getMovieId());
            pstmt.setInt(3, ticket.getScreeningId());
            pstmt.setString(4, ticket.getSeatNumber());
            pstmt.setDouble(5, ticket.getPrice());
            pstmt.setString(6, ticket.getPurchaseDate());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public ArrayList<Ticket> getAllTickets() {
        ArrayList<Ticket> tickets = new ArrayList<>();
        String sql = "SELECT * FROM tickets";
        try (PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                Ticket ticket = new Ticket(
                    resultSet.getInt("id"),
                    resultSet.getInt("movie_id"),
                    resultSet.getInt("customer_id"),
                    resultSet.getDouble("price"),
                    resultSet.getString("purchase_date"),
                    resultSet.getString("seat_number"),
                    resultSet.getInt("invoice_id"),
                    resultSet.getInt("screening_id")
                );
                tickets.add(ticket);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tickets;
    }

    @Override
    public void updateTicket(Ticket ticket) {
        String sql = "UPDATE tickets SET customer_id = ?, movie_id = ?, screening_id = ?, seat_number = ?, price = ?, purchase_date = ? WHERE id = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setInt(1, ticket.getCustomerId());
            pstmt.setInt(2, ticket.getMovieId());
            pstmt.setInt(3, ticket.getScreeningId());
            pstmt.setString(4, ticket.getSeatNumber());
            pstmt.setDouble(5, ticket.getPrice());
            pstmt.setString(6, ticket.getPurchaseDate());
            pstmt.setInt(7, ticket.getId());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteTicket(int id) {
        String sql = "DELETE FROM tickets WHERE id = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //phương thức lấy về danh sách các ghế đã đặt
    @Override
    public ArrayList<String> getReservedSeats(int screeningId) {
        ArrayList<String> reservedSeats = new ArrayList<>();
        String query = "SELECT seat_number FROM tickets WHERE screening_id = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setInt(1, screeningId);
            ResultSet resultSet = pstmt.executeQuery();
            while (resultSet.next()) {
                reservedSeats.add(resultSet.getString("seat_number"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return reservedSeats;
    }
}
