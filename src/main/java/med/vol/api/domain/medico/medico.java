package med.vol.api.domain.medico;

import jakarta.persistence.*;
import lombok.*;
import med.vol.api.domain.endereco.Endereco;

@Table(name = "medicos")
@Entity(name = "Medico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class medico {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private String crm;

    @Enumerated(EnumType.STRING)
    private Especialidade especialidade;

    @Embedded
    private Endereco endereco;

    private Boolean ativo;

    public medico(DadosCadastroMedico dados) {
    this.nome = dados.nome();
    this.telefone = dados.telefone();
    this.email = dados.email();
    this.crm = dados.crm();
    this.especialidade = dados.especialidade();
    this.endereco = new Endereco(dados.endereco());
    this.ativo = true;
    }

    public void atualizarInformacoes(DadosAtualizarMedico dados) {

        if(dados.nome() != null ) {
            this.nome = dados.nome();
        }
        if(dados.telefone() != null ) {
            this.telefone = dados.telefone();
        }

        if(dados.endereco() != null ){
            this.endereco.atualizarEndereco(dados.endereco());
        }

    }

    public void excluir() {
        this.ativo = false;
    }
}
