package giuseppeacquaviva.U5S5L5.repositories;

import giuseppeacquaviva.U5S5L5.entities.Utente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtenteRepository extends JpaRepository<Utente, String> {
    Utente findByUsername(String username);
}
