package com.example.crudproject.service;

import com.example.crudproject.exception.ValidacaoException;
import com.example.crudproject.model.Cliente;
import com.example.crudproject.repository.ClienteRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ClienteService {
    private final ClienteRepository repository;

    public ClienteService(ClienteRepository repository) { this.repository = repository; }
    public List<Cliente> buscarTodos() { return repository.findAll(); }
    public Cliente buscarPorId(Long id) { 
        return repository.findById(id).orElseThrow(() -> new ValidacaoException("Cliente não encontrado")); 
    }
    public Cliente buscarPorEmail(String email) {
        return repository.findByEmail(email).orElseThrow(() -> new ValidacaoException("Cliente não encontrado"));
    }
    public Cliente salvar(Cliente cliente) {
        if (cliente.getNome() == null || cliente.getNome().trim().isEmpty()) {
            throw new ValidacaoException("O nome do cliente não pode ser vazio.");
        }
        if (cliente.getEmail() == null || cliente.getEmail().trim().isEmpty()) {
            throw new ValidacaoException("O email do cliente não pode ser vazio.");
        }
        return repository.save(cliente);
    }
    public void deletar(Long id) { repository.deleteById(id); }
}