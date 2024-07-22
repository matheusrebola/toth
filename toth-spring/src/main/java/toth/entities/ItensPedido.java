package toth.entities;

import java.math.BigDecimal;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record ItensPedido(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		Integer quantidade,
		BigDecimal precoUnitario,
		BigDecimal subtotal,
		Produtos produto,
		Pedidos pedido) 
{

}
