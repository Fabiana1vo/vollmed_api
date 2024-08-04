package med.vol.api.medico;

public record DadosListagemMedico(String nome, String email, String crm, Especialidade especialidade  ) {

    public DadosListagemMedico(medico Medico){
    this(Medico.getNome(), Medico.getEmail(), Medico.getCrm(), Medico.getEspecialidade());
    }
}
