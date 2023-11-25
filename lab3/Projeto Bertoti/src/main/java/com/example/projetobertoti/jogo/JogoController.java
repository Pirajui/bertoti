package com.example.projetobertoti.jogo;


import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class JogoController {

    @Autowired
    JogoRepository jogoRepository;

    @PostMapping("/cadastrarJogo")
    public ResponseEntity<Jogo> cadastrarJogo(@RequestBody @Validated JogoRecord jogoRecordDto){
        var jogo = new Jogo();
        BeanUtils.copyProperties(jogoRecordDto, jogo);
        return ResponseEntity.status(HttpStatus.OK).body(jogoRepository.save(jogo));
    }

    @GetMapping("/jogos")
    public ResponseEntity<List<Jogo>> getAllJogo(){
        return ResponseEntity.status(HttpStatus.OK).body(jogoRepository.findAll());
    }

    @GetMapping("/jogo/{id}")
    public ResponseEntity<Object> getJogo(@PathVariable(value = "id") Long id){
        Optional<Jogo> product0 = jogoRepository.findById(id);
        return ResponseEntity.status(HttpStatus.OK).body(product0.get());
    }

    @DeleteMapping("/jogo/{id}")
    public ResponseEntity<Object> deleteJogo(@PathVariable(value = "id") Long id){
        Optional<Jogo> produto0 = jogoRepository.findById(id);
        jogoRepository.delete(produto0.get());
        return ResponseEntity.status(HttpStatus.OK).body("Jogo deletado com sucesso!");
    }

}
