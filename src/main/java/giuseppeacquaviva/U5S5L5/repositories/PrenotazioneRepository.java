package giuseppeacquaviva.U5S5L5.repositories;

import giuseppeacquaviva.U5S5L5.entities.Postazione;
import giuseppeacquaviva.U5S5L5.entities.Prenotazione;
import giuseppeacquaviva.U5S5L5.entities.Utente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Repository
public interface PrenotazioneRepository extends JpaRepository<Prenotazione, UUID> {
    List<Prenotazione> findByUtenteAndDataPrenotazione(Utente utente, LocalDate dataPrenotazione);
    boolean existsByPostazioneAndDataPrenotazione(Postazione postazione, LocalDate dataPrenotazione);
}
