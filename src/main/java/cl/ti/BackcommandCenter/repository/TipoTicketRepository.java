package cl.ti.BackcommandCenter.repository;

import cl.ti.BackcommandCenter.model.TipoTicket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoTicketRepository extends JpaRepository<TipoTicket, Long> {
}
