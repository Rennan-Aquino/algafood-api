package com.algaworks.algafood.domain.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.algaworks.algafood.domain.model.Restaurante;

public interface RestauranteRepository extends JpaRepository<Restaurante, Long> {

  List<Restaurante> consultarPorNome(String nome, @Param("id") Long id);

  List<Restaurante> findByTaxaFreteBetween(BigDecimal taxaInicial, BigDecimal taxaFinal);

  List<Restaurante> findByNomeContainingAndCozinhaId(String nome, Long cozinhaId);
  

}
