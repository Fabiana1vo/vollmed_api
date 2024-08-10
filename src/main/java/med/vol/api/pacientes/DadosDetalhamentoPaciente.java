package med.vol.api.pacientes;

import med.vol.api.endereco.Endereco;

import med.vol.api.pacientes.paciente;

public record DadosDetalhamentoPaciente(Long id, String nome, String email, String telefone, String cpf, Endereco endereco) {

    public  DadosDetalhamentoPaciente(paciente Paciente) {
        this(Paciente.getId(),Paciente.getNome(), Paciente.getEmail(), Paciente.getCpf(), Paciente.getTelefone(), Paciente.getEndereco());
    }
}
