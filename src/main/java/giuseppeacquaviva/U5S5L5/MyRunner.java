package giuseppeacquaviva.U5S5L5;

import giuseppeacquaviva.U5S5L5.entities.Edificio;
import giuseppeacquaviva.U5S5L5.entities.Postazione;
import giuseppeacquaviva.U5S5L5.entities.Tipo;
import giuseppeacquaviva.U5S5L5.entities.Utente;
import giuseppeacquaviva.U5S5L5.services.EdificioService;
import giuseppeacquaviva.U5S5L5.services.PostazioneService;
import giuseppeacquaviva.U5S5L5.services.PrenotazioneService;
import giuseppeacquaviva.U5S5L5.services.UtenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class MyRunner implements CommandLineRunner {

    @Autowired
    private PostazioneService postazioneService;

    @Autowired
    private EdificioService edificioService;

    @Autowired
    private UtenteService utenteService;

    @Autowired
    private PrenotazioneService prenotazioneService;


    @Override
    public void run(String... args) throws Exception {

      /*  Edificio edificio1 = new Edificio("Edificio A", "Via Roma 1", "Roma");
        Edificio edificio2 = new Edificio("Edificio B", "Via Roma 2", "Milano");
        edificioService.save(edificio1);
        edificioService.save(edificio2);

        Postazione postazione1 = new Postazione("Postazione openspace", Tipo.OPENSPACE, 5, edificio1);
        Postazione postazione2 = new Postazione("Postazione privata", Tipo.PRIVATO, 1, edificio1);
        Postazione postazione3 = new Postazione("Sala riunioni", Tipo.SALA_RIUNIONI, 10, edificio2);
        postazioneService.save(postazione1);
        postazioneService.save(postazione2);
        postazioneService.save(postazione3);

        Utente utente1 = new Utente("utente1", "Mario Rossi", "mario.rossi@example.com");
        Utente utente2 = new Utente("utente2", "Laura Bianchi", "laura.bianchi@example.com");
        utenteService.save(utente1);
        utenteService.save(utente2);

        LocalDate dataPrenotazione1 = LocalDate.now().plusDays(4);
        LocalDate dataPrenotazione2 = LocalDate.now().plusDays(7);

        prenotazioneService.creaPrenotazione(utente1, postazione1, dataPrenotazione1);
        prenotazioneService.creaPrenotazione(utente2, postazione2, dataPrenotazione2);
*/

    }
}
