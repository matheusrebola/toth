package toth.dtos;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.validation.constraints.NotNull;
import toth.entities.MetodoPagamento;
import toth.entities.StatusPedido;
import toth.entities.Usuarios;

public record PedidoDto(
		@NotNull UUID id,
		LocalDateTime dataPedido,
		StatusPedido statusPedido,
		BigDecimal total,
		LocalDateTime dataEnvio,
		LocalDateTime dataEntrega,
		String enderecoEntrega,
		MetodoPagamento metodoPagamento,
		Usuarios usuario) {

}
