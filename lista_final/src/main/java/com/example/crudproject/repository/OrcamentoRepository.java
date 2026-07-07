package com.example.crudproject.repository;

import com.example.crudproject.model.Orcamento;
import com.example.crudproject.model.StatusOrcamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface OrcamentoRepository extends JpaRepository<Orcamento, Integer> {
    List<Orcamento> findByStatus(StatusOrcamento status);
}