package com.peter.pedidos.api.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.peter.pedidos.api.entity.Pedido;

@RestController
@RequestMapping("/api/v1/pedidos")
public class PedidoController {
	private final Logger logger = LoggerFactory.getLogger(PedidoController.class);
	
	@PostMapping
	public ResponseEntity<Pedido> criarPedido(@RequestBody Pedido pedido){
		logger.info("Pedido recebido:{}", pedido.toString());
		return ResponseEntity.status(HttpStatus.CREATED).body(pedido);
	}

}