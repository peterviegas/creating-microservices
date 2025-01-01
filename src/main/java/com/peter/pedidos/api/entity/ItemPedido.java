package com.peter.pedidos.api.entity;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ItemPedido {

	private UUID id = UUID.randomUUID();
	private Produto produto;
	private Integer quantidade;
}
