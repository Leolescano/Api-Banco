package com.leonardo.apibanco.model.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
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
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "usuario_id")
	@JsonBackReference
	private Usuario usuario;

	@ManyToOne(fetch =  FetchType.LAZY)
	@JoinColumn(name = "categoria_id")
	@JsonBackReference
	private Categoria categoria;

	private String tipo;
}