package main.cinemaproject.dao;

import java.util.ArrayList;
import main.cinemaproject.model.Ticket;

public interface ITicket {
    public void addTicket(Ticket ticket);
    public ArrayList<Ticket> getAllTickets();
    public void updateTicket(Ticket ticket);
    public void deleteTicket(int id);
}
