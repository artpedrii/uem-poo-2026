package com.example.crudproject.controller;

import com.example.crudproject.model.Produto;
import com.example.crudproject.service.ProdutoService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public List<Produto> getAllProducts() {
        return produtoService.findAll();
    }

    @PostMapping
    public Produto createProduct(@RequestBody Produto produto) {
        return produtoService.save(produto);
    }

    @GetMapping("/{id}")
    public Produto buscarById(@PathVariable Long id) {
        return produtoService.findById(id);
    }

    @PutMapping("/{id}")
    public Produto colocar(@PathVariable Long id, @RequestBody Produto produto){
        Produto produtoExistente = produtoService.findById(id);
        if (produtoExistente != null){
            produto.setId(id);
            return produtoService.save(produto);
        }
        else {
            return null;
        }
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
       produtoService.deleteById(id);
    }
}
