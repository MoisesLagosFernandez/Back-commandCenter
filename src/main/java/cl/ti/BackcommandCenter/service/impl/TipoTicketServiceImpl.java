package cl.ti.BackcommandCenter.service.impl;

import cl.ti.BackcommandCenter.model.TipoTicket;
import cl.ti.BackcommandCenter.service.TipoTicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cl.ti.BackcommandCenter.repository.TipoTicketRepository;

import java.util.List;

@Service
public class TipoTicketServiceImpl implements TipoTicketService {
    @Autowired
    private TipoTicketRepository tipoTicketRepository;

    @Override
    public TipoTicket saveTipoTicket(TipoTicket tipoTicket) {
        return tipoTicketRepository.save(tipoTicket);
    }

    @Override
    public TipoTicket getTipoTicketById(Long id) {
        return tipoTicketRepository.findById(id).orElse(null);
    }

    @Override
    public List<TipoTicket> getAllTipoTickets() {
        return tipoTicketRepository.findAll();
    }

    @Override
    public void deleteTipoTicket(Long id) {
        tipoTicketRepository.deleteById(id);
    }
}

