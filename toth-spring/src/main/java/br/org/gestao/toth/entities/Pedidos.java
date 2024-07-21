package br.org.gestao.toth.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record Pedidos(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		LocalDateTime dataPedido,
		StatusPedido statusPedido,
		BigDecimal total,
		LocalDateTime dataEnvio,
		LocalDateTime dataEntrega,
		String enderecoEntrega,
		MetodoPagamento metodoPagamento,
		Usuarios usuario) 
{

}
