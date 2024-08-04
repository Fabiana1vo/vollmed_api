package med.vol.api.controller;

import med.vol.api.pacientes.DadosCadastroPaciente;
import med.vol.api.pacientes.DadosListagemPaciente;
import med.vol.api.pacientes.PacienteRepository;
import med.vol.api.pacientes.paciente;
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

    public void cadastrar(@RequestBody DadosCadastroPaciente dados ){
      repository.save(new paciente(dados));
    }


    @GetMapping

    public Page<DadosListagemPaciente> listar(@PageableDefault(size=10, sort= { "nome" })Pageable paginacao){
        return repository.findAll(paginacao).map(DadosListagemPaciente :: new);
    }



}
