package tech.devinhouse.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tech.devinhouse.entity.PessoaEntity;

import tech.devinhouse.service.PessoaService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {
    @Autowired
    PessoaService service;

    @GetMapping()
    public List<PessoaEntity> getPessoas(){
        return service.getAll();
    }

    @PostMapping()

    public void adicionarPessoa (@RequestBody PessoaEntity pessoa){
        service.save(pessoa);
    }
    @GetMapping("/{id}")
    public Optional<PessoaEntity> buscarID (@PathVariable Long id){

       return service.getbyId(id);
    }
    @DeleteMapping("/{id}" )
    public void delete(@PathVariable Long id){
        service.delete(id);
    }
//    @GetMapping("/pessoas/status")
//    public List<PessoaEntity> getByStatus(){
//        return service.findbyStatus();
//
//    }
    @GetMapping("/status")
    public List<PessoaEntity> getByStatus(){
        return service.findbyStatus();


    }
    @GetMapping("/status2") // http://localhost:8080/pessoas/status2?status=true
    public List<PessoaEntity> getStatus(@RequestParam (required = false,value ="status") Boolean status){

        return service.findStatus(status);
    }

    @PutMapping
    public void updatePessoa(@RequestBody PessoaEntity pessoa){
        service.save(pessoa);

    }
    @GetMapping("/filter")
    public List<PessoaEntity> buscaPessoaFilter(@RequestParam("q") String filter){
        return service.filtrarPessoas(filter);
    }
}
