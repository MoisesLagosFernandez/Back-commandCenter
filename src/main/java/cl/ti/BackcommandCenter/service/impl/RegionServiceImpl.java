package cl.ti.BackcommandCenter.service.impl;

import cl.ti.BackcommandCenter.model.Region;
import cl.ti.BackcommandCenter.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cl.ti.BackcommandCenter.repository.RegionRepository;

import java.util.List;

@Service
public class RegionServiceImpl implements RegionService {
    @Autowired
    private RegionRepository regionRepository;

    @Override
    public Region saveRegion(Region region) {
        return regionRepository.save(region);
    }

    @Override
    public Region getRegionById(Long id) {
        return regionRepository.findById(id).orElse(null);
    }

    @Override
    public List<Region> getAllRegions() {
        return regionRepository.findAll();
    }

    @Override
    public void deleteRegion(Long id) {
        regionRepository.deleteById(id);
    }
}

