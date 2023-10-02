package com.br.riccskn.repository;

import com.br.riccskn.model.DespesaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DespesasRepository extends JpaRepository<DespesaModel,  Integer> {

      Boolean existsById(int id);

}
