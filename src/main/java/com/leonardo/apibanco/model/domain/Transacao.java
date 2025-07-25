package com.leonardo.apibanco.model.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "transacoes")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class Transacao {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String descricao;
	
	private Double valor;
	
	private String data;
	

	private Long categoriaId;
	

	private Long usuarioId;

	private String tipo;
}