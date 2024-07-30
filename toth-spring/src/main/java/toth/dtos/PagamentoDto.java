package toth.dtos;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.validation.constraints.NotNull;
import toth.entities.Pedidos;
import toth.entities.StatusPagamento;

public record PagamentoDto(
		@NotNull UUID id,
		String metodoPagamento,
		StatusPagamento statusPagamento,
		BigDecimal valor,
		LocalDateTime dataPagamento,
		String transacaoId,
		Pedidos pedido) {

}
