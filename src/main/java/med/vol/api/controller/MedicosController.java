package med.vol.api.controller;

import jakarta.validation.Valid;
import med.vol.api.endereco.Endereco;
import med.vol.api.medico.DadosCadastroMedico;
import med.vol.api.medico.DadosListagemMedico;
import med.vol.api.medico.MedicoRepository;
import med.vol.api.medico.medico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("medicos")
public class MedicosController {

    @Autowired
    private MedicoRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroMedico dados){
        repository.save(new medico(dados));
    }

    @GetMapping

    public Page<DadosListagemMedico> listar(Pageable paginacao){
        return repository.findAll(paginacao).map(DadosListagemMedico::new);
    }
}
