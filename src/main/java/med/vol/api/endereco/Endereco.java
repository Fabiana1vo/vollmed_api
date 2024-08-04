package med.vol.api.endereco;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor

public class Endereco {
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String uf;
    private String cep;

    public Endereco(DadosEndereco endereco) {
    this.logradouro = endereco.logradouro();
    this.numero = endereco.numero();
    this.complemento = endereco.complemento();
    this.bairro = endereco.bairro();
    this.cidade = endereco.cidade();
    this.uf = endereco.uf();
    this.cep = endereco.cep();
    }


    public void atualizarEndereco(Endereco dados) {

        if(this.logradouro != null) {
            this.logradouro = dados.logradouro;
        }
        if(this.numero != null) {
            this.numero = dados.numero;
        }

        if(this.complemento != null) {
            this.complemento = dados.complemento;
        }
        if(this.bairro != null) {
            this.bairro = dados.bairro;
        }
        if(this.cidade != null) {
            this.cidade = dados.cidade;
        }
        if(this.uf != null) {
            this.uf = dados.uf;
        }
        if(this.cep != null) {
            this.cep = dados.cep;
        }


    }
}
