package med.vol.api.pacientes;

public record DadosListagemPaciente(String nome, String email, String cpf, Long id) {
    public DadosListagemPaciente(paciente Paciente){
        this(Paciente.getNome(), Paciente.getEmail(), Paciente.getCpf(), Paciente.getId());
    }

}
