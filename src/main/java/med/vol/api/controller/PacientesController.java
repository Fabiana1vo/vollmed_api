package med.vol.api.controller;

import jakarta.validation.Valid;
import med.vol.api.pacientes.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("pacientes")
public class PacientesController {

    @Autowired
    private PacienteRepository repository;

    @PostMapping
    @Transactional

    public void cadastrar(@RequestBody @Valid DadosCadastroPaciente dados ){
      repository.save(new paciente(dados));
    }


    @GetMapping

    public Page<DadosListagemPaciente> listar(@PageableDefault(size=10, sort= { "nome" })Pageable paginacao){
        return repository.findAll(paginacao).map(DadosListagemPaciente :: new);
    }

    @PutMapping
    @Transactional
    public void atualizar(@RequestBody @Valid DadosAtualizarPaciente dados){
        var paciente = repository.getReferenceById(dados.id());

        paciente.atualizarInformacoes(dados);
    }


}
