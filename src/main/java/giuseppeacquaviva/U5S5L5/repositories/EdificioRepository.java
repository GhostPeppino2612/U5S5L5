package giuseppeacquaviva.U5S5L5.repositories;

import giuseppeacquaviva.U5S5L5.entities.Edificio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface EdificioRepository extends JpaRepository<Edificio, UUID> {
    List<Edificio> findByCitta(String citta);

}
