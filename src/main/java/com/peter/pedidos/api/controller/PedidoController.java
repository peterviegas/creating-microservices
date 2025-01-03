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

import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;


@Tag(name = "Pedidos", description = "Resource for creade a new Order")
@RestController
@RequestMapping("/api/v1/pedidos")
public class PedidoController {
	private final Logger logger = LoggerFactory.getLogger(PedidoController.class);
	
	@Operation(summary = "Create a ne Order", description = "Have the operations for creat a new order",
			responses = @ApiResponse(responseCode = "201", description = "Resource created with success",
			content = @Content(mediaType = "application/json", schema = @Schema(implementation = Pedido.class)))) 
	@PostMapping
	public ResponseEntity<Pedido> criarPedido(@RequestBody Pedido pedido){
		logger.info("Pedido recebido request: {}", pedido);

		
		logger.info("Pedido recebido:{}", pedido.toString());
		return ResponseEntity.status(HttpStatus.CREATED).body(pedido);
	}
}
