package com.github.Fabr1c100.study_apiw;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("produtos")

public class ControllerProduto {

    @PostMapping
    public ResponseEntity<String> crete(){
        return ResponseEntity.status(201).body("produto cadastrado: maça");
    }

    @PutMapping
    public ResponseEntity<String> update(){
        return ResponseEntity.status(200).body("produto atualizado");
    }

    @GetMapping
    public ResponseEntity<String> find(){
        return ResponseEntity.status(200).body("maça");
    } 

    @DeleteMapping
    public ResponseEntity<Void> delete(){
        return ResponseEntity.status(204).build();
    }
}
