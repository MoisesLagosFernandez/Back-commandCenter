package cl.ti.BackcommandCenter.service.impl;

import cl.ti.BackcommandCenter.model.SLA;
import cl.ti.BackcommandCenter.service.SLAService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cl.ti.BackcommandCenter.repository.SLARepository;

import java.util.List;

@Service
public class SLAServiceImpl implements SLAService {
    @Autowired
    private SLARepository slaRepository;

    @Override
    public SLA saveSLA(SLA sla) {
        return slaRepository.save(sla);
    }

    @Override
    public SLA getSLAById(Long id) {
        return slaRepository.findById(id).orElse(null);
    }

    @Override
    public List<SLA> getAllSLAs() {
        return slaRepository.findAll();
    }

    @Override
    public void deleteSLA(Long id) {
        slaRepository.deleteById(id);
    }
}
