package med.vol.api.domain.pacientes;
import jakarta.persistence.*;
import lombok.*;
import med.vol.api.domain.endereco.Endereco;

@Table(name = "paciente")
@Entity(name = "pacientes")

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")

public class paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String cpf;
    private String email;
    private String telefone;
    private Boolean ativo;

    @Embedded
    private Endereco endereco;

    public paciente(DadosCadastroPaciente dados){
        this.nome = dados.nome();
        this.cpf = dados.cpf();
        this.email = dados.email();
        this.telefone = dados.telefone();
        this.endereco = new Endereco(dados.endereco());
        this.ativo = true;
    }

    public void atualizarInformacoes(DadosAtualizarPaciente dados) {
        if(dados.nome() != null) {
            this.nome = dados.nome();
        }
        if(dados.telefone() != null ){
            this.telefone = dados.telefone();
       }
        if(dados.endereco() != null) {
            this.endereco.atualizarEndereco(endereco);
        }
    }

    public void excluir() {
        this.ativo = false;
    }
}
