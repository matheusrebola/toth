package toth.dtos;

import java.math.BigDecimal;

import toth.entities.Pedidos;
import toth.entities.Produtos;

public record ItemPedidoCreateDto(
		Integer quantidade,
		BigDecimal precoUnitario,
		BigDecimal subtotal,
		Produtos produto,
		Pedidos pedido) {

}
