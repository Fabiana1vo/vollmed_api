package med.vol.api.medico;

import jakarta.validation.constraints.NotNull;
import med.vol.api.endereco.Endereco;

public record DadosAtualizarMedico(
       @NotNull
        Long id,
        String nome,
        String telefone,
        Endereco endereco) {

}
