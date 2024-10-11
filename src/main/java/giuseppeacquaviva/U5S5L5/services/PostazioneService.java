package giuseppeacquaviva.U5S5L5.services;

import giuseppeacquaviva.U5S5L5.entities.Postazione;
import giuseppeacquaviva.U5S5L5.entities.Tipo;
import giuseppeacquaviva.U5S5L5.repositories.PostazioneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostazioneService {

    @Autowired
    private PostazioneRepository postazioneRepository;

    public void save(Postazione postazione) {
        postazioneRepository.save(postazione);
    }

    public List<Postazione> findByTipoAndCitta(String tipo, String citta) {
        return postazioneRepository.findByTipoAndEdificio_Citta(Tipo.valueOf(tipo), citta);
    }
}
