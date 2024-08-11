package med.vol.api.domain.pacientes;

import jakarta.validation.constraints.NotNull;
import med.vol.api.domain.endereco.Endereco;

public record DadosAtualizarPaciente(
        @NotNull
        Long id,

        String nome,

        String telefone,

        Endereco endereco) {
}
