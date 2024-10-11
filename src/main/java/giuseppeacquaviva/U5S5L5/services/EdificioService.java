package giuseppeacquaviva.U5S5L5.services;

import giuseppeacquaviva.U5S5L5.entities.Edificio;
import giuseppeacquaviva.U5S5L5.repositories.EdificioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EdificioService {

    @Autowired
    private EdificioRepository edificioRepository;

    public void save(Edificio edificio) {
        edificioRepository.save(edificio);
        System.out.println("Edificio " + edificio + " salvato con successo");
    }

    public List<Edificio> findByCitta(String citta) {
        return edificioRepository.findByCitta(citta);
    }
}
