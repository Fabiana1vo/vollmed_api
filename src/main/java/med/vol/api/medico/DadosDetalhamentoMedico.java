package med.vol.api.medico;

import med.vol.api.endereco.Endereco;

public record DadosDetalhamentoMedico(Long id, String nome, String email, String crm, String telefone,  Especialidade especialidade, Endereco endereco) {


    public DadosDetalhamentoMedico(medico Medico){
        this(Medico.getId(), Medico.getNome(), Medico.getEmail(), Medico.getCrm(), Medico.getTelefone(), Medico.getEspecialidade(), Medico.getEndereco());
    }
}
