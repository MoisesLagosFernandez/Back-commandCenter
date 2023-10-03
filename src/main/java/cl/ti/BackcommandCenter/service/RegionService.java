package cl.ti.BackcommandCenter.service;

import cl.ti.BackcommandCenter.model.Region;

import java.util.List;

public interface RegionService {
    Region saveRegion(Region region);
    Region getRegionById(Long id);
    List<Region> getAllRegions();
    void deleteRegion(Long id);
}
