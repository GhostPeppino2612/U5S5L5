package giuseppeacquaviva.U5S5L5.services;

import giuseppeacquaviva.U5S5L5.entities.Utente;
import giuseppeacquaviva.U5S5L5.repositories.UtenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UtenteService {
    @Autowired
    private UtenteRepository utenteRepository;

    public Utente findByUsername(String username) {
        return utenteRepository.findByUsername(username);
    };

    public void save(Utente utente) {
        utenteRepository.save(utente);
    }
}
