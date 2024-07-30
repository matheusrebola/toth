package toth.dtos;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import toth.entities.MetodoPagamento;
import toth.entities.StatusPedido;
import toth.entities.Usuarios;

public record PedidoCreateDto(
		LocalDateTime dataPedido,
		StatusPedido statusPedido,
		BigDecimal total,
		LocalDateTime dataEnvio,
		LocalDateTime dataEntrega,
		String enderecoEntrega,
		MetodoPagamento metodoPagamento,
		Usuarios usuario) {

}
