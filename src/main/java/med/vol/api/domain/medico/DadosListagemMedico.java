package med.vol.api.domain.medico;

public record DadosListagemMedico(String nome, String email, String crm, Especialidade especialidade, Long id, Boolean ativo  ) {

    public DadosListagemMedico(medico Medico){
    this(Medico.getNome(), Medico.getEmail(), Medico.getCrm(), Medico.getEspecialidade(), Medico.getId(), Medico.getAtivo());
    }
}
