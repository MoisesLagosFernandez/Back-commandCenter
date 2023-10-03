package cl.ti.BackcommandCenter.repository;

import cl.ti.BackcommandCenter.model.SLA;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SLARepository extends JpaRepository<SLA, Long> {
}
