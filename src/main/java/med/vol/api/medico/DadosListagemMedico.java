package med.vol.api.medico;

public record DadosListagemMedico(String nome, String email, String crm, Especialidade especialidade, Long id  ) {

    public DadosListagemMedico(medico Medico){
    this(Medico.getNome(), Medico.getEmail(), Medico.getCrm(), Medico.getEspecialidade(), Medico.getId());
    }
}
