package giuseppeacquaviva.U5S5L5.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "utente")
public class Utente {
    @Id
    private String username;
    private String nomeCompleto;
    private String email;
}
