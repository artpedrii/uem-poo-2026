package com.example.crudproject.service;

import com.example.crudproject.exception.ValidacaoException;
import com.example.crudproject.model.Orcamento;
import com.example.crudproject.model.StatusOrcamento;
import com.example.crudproject.repository.OrcamentoRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class OrcamentoService {
    private final OrcamentoRepository repository;

    public OrcamentoService(OrcamentoRepository repository) { this.repository = repository; }
    public List<Orcamento> buscarTodos() { return repository.findAll(); }
    public Orcamento buscarPorId(Integer id) {
        return repository.findById(id).orElseThrow(() -> new ValidacaoException("Orçamento não encontrado"));
    }
    public List<Orcamento> buscarPorStatus(StatusOrcamento status) { return repository.findByStatus(status); }
    public Orcamento salvar(Orcamento orcamento) {
        orcamento.calcularValorTotal();
        return repository.save(orcamento);
    }
    public void deletar(Integer id) { repository.deleteById(id); }
    public Orcamento aprovarOrcamento(Integer id) {
        Orcamento orcamento = buscarPorId(id);
        orcamento.aprovar();
        return repository.save(orcamento);
    }
    public Orcamento rejeitarOrcamento(Integer id) {
        Orcamento orcamento = buscarPorId(id);
        orcamento.rejeitar();
        return repository.save(orcamento);
    }
}