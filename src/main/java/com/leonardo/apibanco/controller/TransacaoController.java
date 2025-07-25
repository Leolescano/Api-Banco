package com.leonardo.apibanco.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leonardo.apibanco.service.TransacaoService;

@RestController
@RequestMapping("/transacao")
public class TransacaoController {
	private final TransacaoService  transacaoService;
	
	public TransacaoController(TransacaoService transacaoService) {
		this.transacaoService = transacaoService;
	}
}
