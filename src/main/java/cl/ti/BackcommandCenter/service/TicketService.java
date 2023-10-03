package cl.ti.BackcommandCenter.service;

import cl.ti.BackcommandCenter.model.Ticket;

import java.util.List;

public interface TicketService {
    Ticket saveTicket(Ticket ticket);
    Ticket getTicketById(Long id);
    List<Ticket> getAllTickets();
    void deleteTicket(Long id);
}

