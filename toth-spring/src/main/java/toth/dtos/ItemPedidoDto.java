package toth.dtos;

import java.math.BigDecimal;
import java.util.UUID;

import jakarta.validation.constraints.NotNull;
import toth.entities.Pedidos;
import toth.entities.Produtos;

public record ItemPedidoDto(
		@NotNull UUID id,
		Integer quantidade,
		BigDecimal precoUnitario,
		BigDecimal subtotal,
		Produtos produto,
		Pedidos pedido) {

}
