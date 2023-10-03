package cl.ti.BackcommandCenter.service.impl;

import cl.ti.BackcommandCenter.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cl.ti.BackcommandCenter.repository.RecordRepository;

import cl.ti.BackcommandCenter.model.Record;

import java.util.List;

@Service
public class RecordServiceImpl implements RecordService {
    @Autowired
    private RecordRepository recordRepository;

    @Override
    public Record saveRecord(Record record) {
        return recordRepository.save(record);
    }

    @Override
    public Record getRecordById(Long id) {
        return recordRepository.findById(id).orElse(null);
    }

    @Override
    public List<Record> getAllRecords() {
        return recordRepository.findAll();
    }

    @Override
    public void deleteRecord(Long id) {
        recordRepository.deleteById(id);
    }
}
