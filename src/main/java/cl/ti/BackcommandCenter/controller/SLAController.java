package cl.ti.BackcommandCenter.controller;

import cl.ti.BackcommandCenter.model.SLA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import cl.ti.BackcommandCenter.service.SLAService;

import java.util.List;

@RestController
@RequestMapping("/api/slas")
public class SLAController {
    @Autowired
    private SLAService slaService;

    @PostMapping
    public ResponseEntity<SLA> createSLA(@RequestBody SLA sla) {
        SLA createdSLA = slaService.saveSLA(sla);
        return ResponseEntity.ok(createdSLA);
    }

    @GetMapping("/{id}")
    public ResponseEntity<SLA> getSLAById(@PathVariable Long id) {
        SLA sla = slaService.getSLAById(id);
        if (sla == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(sla);
    }

    @GetMapping
    public ResponseEntity<List<SLA>> getAllSLAs() {
        List<SLA> slas = slaService.getAllSLAs();
        return ResponseEntity.ok(slas);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSLA(@PathVariable Long id) {
        slaService.deleteSLA(id);
        return ResponseEntity.noContent().build();
    }
}

