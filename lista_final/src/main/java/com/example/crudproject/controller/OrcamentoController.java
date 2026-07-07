package com.example.crudproject.controller;

import com.example.crudproject.model.Orcamento;
import com.example.crudproject.model.StatusOrcamento;
import com.example.crudproject.service.OrcamentoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/orcamentos")
public class OrcamentoController {
    private final OrcamentoService service;

    public OrcamentoController(OrcamentoService service) { this.service = service; }

    @GetMapping
    public ResponseEntity<List<Orcamento>> listar() { return ResponseEntity.ok(service.buscarTodos()); }
    
    @GetMapping("/{id}")
    public ResponseEntity<Orcamento> buscar(@PathVariable Integer id) { return ResponseEntity.ok(service.buscarPorId(id)); }
    
    @GetMapping("/status/{status}")
    public ResponseEntity<List<Orcamento>> buscarPorStatus(@PathVariable StatusOrcamento status) {
        return ResponseEntity.ok(service.buscarPorStatus(status));
    }
    
    @PostMapping
    public ResponseEntity<Orcamento> criar(@RequestBody Orcamento orcamento) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.salvar(orcamento));
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<Orcamento> atualizar(@PathVariable Integer id, @RequestBody Orcamento orcamento) {
        orcamento.setId(id);
        return ResponseEntity.ok(service.salvar(orcamento));
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Integer id) {
        service.deletar(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}/aprovar")
    public ResponseEntity<Orcamento> aprovar(@PathVariable Integer id) { return ResponseEntity.ok(service.aprovarOrcamento(id)); }

    @PutMapping("/{id}/rejeitar")
    public ResponseEntity<Orcamento> rejeitar(@PathVariable Integer id) { return ResponseEntity.ok(service.rejeitarOrcamento(id)); }
}