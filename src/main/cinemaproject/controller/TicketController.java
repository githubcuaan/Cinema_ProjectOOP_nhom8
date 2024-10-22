package main.cinemaproject.controller;

import java.util.ArrayList;
import main.cinemaproject.dao.TicketDAO;
import main.cinemaproject.database.JBDCUntil;
import main.cinemaproject.model.Ticket;

public class TicketController {
    private TicketDAO ticketDAO;

    public TicketController() {
        this.ticketDAO = new TicketDAO(JBDCUntil.getConnection());
    }

    public void addTicket(Ticket ticket) {
        ticketDAO.addTicket(ticket);
    }

    public ArrayList<Ticket> getAllTickets() {
        return ticketDAO.getAllTickets();
    }

    public void updateTicket(Ticket ticket) {
        ticketDAO.updateTicket(ticket);
    }

    public void deleteTicket(int id) {
        ticketDAO.deleteTicket(id);
    }
}
