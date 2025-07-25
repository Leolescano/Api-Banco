package com.leonardo.apibanco.service;

import org.springframework.stereotype.Service;

import com.leonardo.apibanco.repository.TransacaoRepository;

import lombok.AllArgsConstructor;

@Service
public class TransacaoService {
	
	private final TransacaoRepository transacaoRepository;
	
	public TransacaoService(TransacaoRepository transacaoRepository) {
		this.transacaoRepository = transacaoRepository;
	}
	
}
