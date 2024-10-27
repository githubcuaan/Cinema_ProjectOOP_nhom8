package main.cinemaproject.controller;

import java.util.ArrayList;

import main.cinemaproject.dao.TicketDAO;
import main.cinemaproject.utils.JBDCUtils;
import main.cinemaproject.model.Ticket;

public class TicketController {
    private TicketDAO ticketDAO;

    public TicketController() {
        this.ticketDAO = new TicketDAO(JBDCUtils.getConnection());
    }

    public boolean addTicket(Ticket ticket) {
        return ticketDAO.addTicket(ticket);
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

    public ArrayList<String> getReservedSeats(int screeningId) {
        return ticketDAO.getReservedSeats(screeningId);
    }
}
