package com.leonardo.apibanco.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.leonardo.apibanco.model.domain.Transacao;

@Repository
public interface TransacaoRepository extends JpaRepository<Transacao, Long> {
	
}
