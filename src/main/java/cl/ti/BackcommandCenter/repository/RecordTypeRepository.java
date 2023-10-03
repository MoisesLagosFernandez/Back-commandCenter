package cl.ti.BackcommandCenter.repository;

import cl.ti.BackcommandCenter.model.RecordType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecordTypeRepository extends JpaRepository<RecordType, Long> {
}
