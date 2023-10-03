package cl.ti.BackcommandCenter.controller;

import cl.ti.BackcommandCenter.model.TipoTicket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import cl.ti.BackcommandCenter.service.TipoTicketService;

import java.util.List;

@RestController
@RequestMapping("/api/tipo-tickets")
public class TipoTicketController {
    @Autowired
    private TipoTicketService tipoTicketService;

    @PostMapping
    public ResponseEntity<TipoTicket> createTipoTicket(@RequestBody TipoTicket tipoTicket) {
        TipoTicket createdTipoTicket = tipoTicketService.saveTipoTicket(tipoTicket);
        return ResponseEntity.ok(createdTipoTicket);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TipoTicket> getTipoTicketById(@PathVariable Long id) {
        TipoTicket tipoTicket = tipoTicketService.getTipoTicketById(id);
        if (tipoTicket == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(tipoTicket);
    }

    @GetMapping
    public ResponseEntity<List<TipoTicket>> getAllTipoTickets() {
        List<TipoTicket> tipoTickets = tipoTicketService.getAllTipoTickets();
        return ResponseEntity.ok(tipoTickets);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTipoTicket(@PathVariable Long id) {
        tipoTicketService.deleteTipoTicket(id);
        return ResponseEntity.noContent().build();
    }
}
