package cl.ti.BackcommandCenter.service;

import cl.ti.BackcommandCenter.model.RecordType;

import java.util.List;

public interface RecordTypeService {
    RecordType saveRecordType(RecordType recordType);
    RecordType getRecordTypeById(Long id);
    List<RecordType> getAllRecordTypes();
    void deleteRecordType(Long id);
}

