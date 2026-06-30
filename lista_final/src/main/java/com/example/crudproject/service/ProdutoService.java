package com.example.crudproject.service;

import com.example.crudproject.exception.PrecoInvalidoException;
import com.example.crudproject.model.Produto;
import com.example.crudproject.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository productRepository;

    public List<Produto> findAll() {
        return productRepository.findAll();
    }

    public Produto findById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    public Produto save(Produto product) {
        if (product.getPreco() <= 0){
            throw new PrecoInvalidoException("O preço do produto deve ser maior que zero!");
        }
        else {
            return productRepository.save(product);
        }
    }

    public void deleteById(Long id) {
        productRepository.deleteById(id);
    }
}
