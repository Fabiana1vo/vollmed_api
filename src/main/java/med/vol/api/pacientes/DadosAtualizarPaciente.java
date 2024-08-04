package med.vol.api.pacientes;

import jakarta.validation.constraints.NotNull;
import med.vol.api.endereco.Endereco;

public record DadosAtualizarPaciente(
        @NotNull
        Long id,

        String nome,

        String telefone,

        Endereco endereco) {
}
