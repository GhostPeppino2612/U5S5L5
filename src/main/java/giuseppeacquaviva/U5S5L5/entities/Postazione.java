package giuseppeacquaviva.U5S5L5.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
@Table(name = "postazione")
public class Postazione {
    @Id
    @GeneratedValue
    private UUID id;
    private String descrizione;
    @Enumerated(EnumType.STRING)
    private Tipo tipo;
    private int numeroMassimoOccupanti;
    @ManyToOne
    @JoinColumn(name = "edificio_id", nullable = false)
    private Edificio edificio;

    public Postazione(String descrizione, Tipo tipo, int numeroMassimoOccupanti, Edificio edificio) {
        this.descrizione = descrizione;
        this.tipo = tipo;
        this.numeroMassimoOccupanti = numeroMassimoOccupanti;
        this.edificio = edificio;
    }
}
