package med.vol.api.domain.medico;

import jakarta.validation.constraints.NotNull;
import med.vol.api.domain.endereco.Endereco;

public record DadosAtualizarMedico(
       @NotNull
        Long id,
        String nome,
        String telefone,
        Endereco endereco) {

}
