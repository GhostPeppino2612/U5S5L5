package giuseppeacquaviva.U5S5L5.services;

import giuseppeacquaviva.U5S5L5.entities.Postazione;
import giuseppeacquaviva.U5S5L5.entities.Prenotazione;
import giuseppeacquaviva.U5S5L5.entities.Utente;
import giuseppeacquaviva.U5S5L5.exceptions.PostazioneException;
import giuseppeacquaviva.U5S5L5.repositories.PrenotazioneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class PrenotazioneService {

    @Autowired
    private PrenotazioneRepository prenotazioneRepository;

    public void creaPrenotazione(Utente utente, Postazione postazione, LocalDate data) {
        if (prenotazioneRepository.existsByPostazioneAndDataPrenotazione(postazione, data)) {
            throw new PostazioneException("Postazione già prenotata per la data selezionata.");
        }
        Prenotazione prenotazione = new Prenotazione();
        prenotazione.setUtente(utente);
        prenotazione.setPostazione(postazione);
        prenotazione.setDataPrenotazione(data);
        prenotazioneRepository.save(prenotazione);
    }

    public List<Prenotazione> findByUtenteAndDataPrenotazione(Utente utente, LocalDate dataPrenotazione) {
        return prenotazioneRepository.findByUtenteAndDataPrenotazione(utente, dataPrenotazione);
    }
}
