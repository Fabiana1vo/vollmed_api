package med.vol.api.domain.usuarios;


import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name="usuario")
@Entity(name="usuarios")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(of="id")
public class usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String login;
    private String senha;
}
