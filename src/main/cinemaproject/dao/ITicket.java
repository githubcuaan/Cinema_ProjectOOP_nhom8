package main.cinemaproject.dao;

import java.util.ArrayList;
import main.cinemaproject.model.Ticket;

public interface ITicket {
    public boolean addTicket(Ticket ticket);
    public ArrayList<Ticket> getAllTickets();
    public void updateTicket(Ticket ticket);
    public void deleteTicket(int id);
    public ArrayList<String> getReservedSeats(int screeningId);
}
