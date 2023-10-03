package cl.ti.BackcommandCenter.service;

import cl.ti.BackcommandCenter.model.SLA;

import java.util.List;

public interface SLAService {
    SLA saveSLA(SLA sla);
    SLA getSLAById(Long id);
    List<SLA> getAllSLAs();
    void deleteSLA(Long id);
}

