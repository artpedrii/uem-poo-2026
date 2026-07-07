package com.example.crudproject.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Orcamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String descricao;
    private double valor;

    @Enumerated(EnumType.STRING)
    private StatusOrcamento status = StatusOrcamento.PENDENTE;

    @ManyToOne
    private Cliente cliente;

    @ManyToMany
    private List<Produto> produtos;

    public void calcularValorTotal() {
        this.valor = 0.0;
        if (this.produtos != null) {
            for (Produto p : produtos) {
                this.valor += p.getPreco();
            }
        }
    }

    public void aprovar() { this.status = StatusOrcamento.APROVADO; }
    public void rejeitar() { this.status = StatusOrcamento.REJEITADO; }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
    public double getValor() { return valor; }
    public StatusOrcamento getStatus() { return status; }
    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }
    public List<Produto> getProdutos() { return produtos; }
    public void setProdutos(List<Produto> produtos) { this.produtos = produtos; }
}