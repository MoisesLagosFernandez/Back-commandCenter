package cl.ti.BackcommandCenter.service.impl;

import cl.ti.BackcommandCenter.model.RecordType;
import cl.ti.BackcommandCenter.service.RecordTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cl.ti.BackcommandCenter.repository.RecordTypeRepository;

import java.util.List;

@Service
public class RecordTypeServiceImpl implements RecordTypeService {
    @Autowired
    private RecordTypeRepository recordTypeRepository;

    @Override
    public RecordType saveRecordType(RecordType recordType) {
        return recordTypeRepository.save(recordType);
    }

    @Override
    public RecordType getRecordTypeById(Long id) {
        return recordTypeRepository.findById(id).orElse(null);
    }

    @Override
    public List<RecordType> getAllRecordTypes() {
        return recordTypeRepository.findAll();
    }

    @Override
    public void deleteRecordType(Long id) {
        recordTypeRepository.deleteById(id);
    }
}

