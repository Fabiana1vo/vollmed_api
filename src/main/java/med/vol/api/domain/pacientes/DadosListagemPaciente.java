package med.vol.api.domain.pacientes;

public record DadosListagemPaciente(String nome, String email, String cpf, Long id, Boolean ativo) {
    public DadosListagemPaciente(paciente Paciente){
        this(Paciente.getNome(), Paciente.getEmail(), Paciente.getCpf(), Paciente.getId(), Paciente.getAtivo());
    }

}
