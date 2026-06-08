package com.tutu.tutu.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ProdutoControle {
    
    @GetMapping
    public String lerOrcamento(){
        return "Hello world!";
    }

    @PostMapping
    public String criarOrcamento(){
        return "Orçamento criado";
    }

    @PutMapping
    public String alterarOrcamento(){
        return "Orçamento alterado";
    }

    @DeleteMapping
    public String removerOrcamento(){
        return "Orçametnto removido.";
    }
}
