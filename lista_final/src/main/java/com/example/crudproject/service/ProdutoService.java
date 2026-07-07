package com.example.crudproject.service;

import com.example.crudproject.exception.ValidacaoException;
import com.example.crudproject.model.Produto;
import com.example.crudproject.repository.ProdutoRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProdutoService {
    private final ProdutoRepository repository;

    public ProdutoService(ProdutoRepository repository) { this.repository = repository; }
    public List<Produto> buscarTodos() { return repository.findAll(); }
    public Produto buscarPorId(Long id) { 
        return repository.findById(id).orElseThrow(() -> new ValidacaoException("Produto não encontrado")); 
    }
    public Produto salvar(Produto produto) {
        if (produto.getPreco() <= 0) throw new ValidacaoException("O preço deve ser maior que zero.");
        return repository.save(produto);
    }
    public void deletar(Long id) { repository.deleteById(id); }
}
