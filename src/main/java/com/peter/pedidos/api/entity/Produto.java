package com.peter.pedidos.api.entity;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Produto {
	private UUID id = UUID.randomUUID();
	private String nome;
	private Double valor;
}
