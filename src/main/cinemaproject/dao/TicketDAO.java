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
        String sql = "INSERT INTO tickets (customer_id, movie_id, seat_number, price, purchase_date) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setInt(1, ticket.getCustomerId());
            pstmt.setInt(2, ticket.getMovieId());
            pstmt.setString(3, ticket.getSeatNumber());
            pstmt.setDouble(4, ticket.getPrice());
            pstmt.setString(5, ticket.getPurchaseDate());
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
                    resultSet.getString("seat_number")
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
        String sql = "UPDATE tickets SET customer_id = ?, movie_id = ?, seat_number = ?, price = ?, purchase_date = ? WHERE id = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setInt(1, ticket.getCustomerId());
            pstmt.setInt(2, ticket.getMovieId());
            pstmt.setString(3, ticket.getSeatNumber());
            pstmt.setDouble(4, ticket.getPrice());
            pstmt.setString(5, ticket.getPurchaseDate());
            pstmt.setInt(6, ticket.getId());
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
}
