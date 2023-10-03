package cl.ti.BackcommandCenter.service;

import cl.ti.BackcommandCenter.model.Device;

import java.util.List;

public interface DeviceService {
    Device saveDevice(Device device);
    Device getDeviceById(Long id);
    List<Device> getAllDevices();
    void deleteDevice(Long id);
}

