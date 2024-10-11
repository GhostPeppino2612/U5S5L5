package giuseppeacquaviva.U5S5L5.repositories;

import giuseppeacquaviva.U5S5L5.entities.Postazione;
import giuseppeacquaviva.U5S5L5.entities.Tipo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface PostazioneRepository extends JpaRepository<Postazione, UUID> {
    List<Postazione> findByTipoAndEdificio_Citta(Tipo tipo, String citta);
}
