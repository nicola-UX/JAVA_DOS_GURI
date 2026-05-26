package com.dmgmodels.lojaRoupas.controller;

import com.dmgmodels.lojaRoupas.model.DadosCadastroRoupa;
import com.dmgmodels.lojaRoupas.model.Roupa;
import com.dmgmodels.lojaRoupas.repository.RoupaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/roupa")
public class ControllerProduto {

    @Autowired
    private RoupaRepository roupaRepository;

    @PostMapping
    public void cadastrarProduto(@RequestBody DadosCadastroRoupa dados){
        roupaRepository.save(new Roupa(dados));
    }

    @GetMapping
    public List<Roupa> listarProdutos(){
        return roupaRepository.findAll();
    }

    @GetMapping("/nomeProduto/{nomeProduto}")
    public List<Roupa> listarProdutosPorNome(@PathVariable String nomeProduto){
        return roupaRepository.findByNomeProduto(nomeProduto);
    }

    @DeleteMapping("/{id}")
    public void deletarProduto(@PathVariable Long id){
        roupaRepository.deleteById(id);
    }
}
