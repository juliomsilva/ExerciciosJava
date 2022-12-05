package tech.devinhouse.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import tech.devinhouse.entity.PessoaEntity;
import tech.devinhouse.repository.PessoaRepository;

import java.util.List;
import java.util.Optional;

@Service

public class PessoaService {
    @Autowired
    private PessoaRepository repository;


    public List<PessoaEntity> getAll() {
        return repository.findAll();
    }

    public void save(PessoaEntity pessoa) {
        repository.save(pessoa);
    }
    public Optional<PessoaEntity> getbyId(Long id){

        return repository.findById(id);

    }
    public void delete (Long id){
        repository.deleteById(id);
    }
//   public List<PessoaEntity> findbyStatus(){
//        return repository.getAll();
//   }
   public List<PessoaEntity> findbyStatus() {
        return repository.getAllByStatusTrue();
   }
   public List<PessoaEntity> findStatus(boolean status){
        return repository.getAllByStatus(status);
   }
   public List<PessoaEntity> filtrarPessoas(String filter){
        return repository.buscarPessoaPorNomeOuEmail(filter);
   }

}
