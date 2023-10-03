package cl.ti.BackcommandCenter.service;

import cl.ti.BackcommandCenter.model.TipoTicket;

import java.util.List;

public interface TipoTicketService {
    TipoTicket saveTipoTicket(TipoTicket tipoTicket);
    TipoTicket getTipoTicketById(Long id);
    List<TipoTicket> getAllTipoTickets();
    void deleteTipoTicket(Long id);
}
