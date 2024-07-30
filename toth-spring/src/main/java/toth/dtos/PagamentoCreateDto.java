package toth.dtos;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import toth.entities.Pedidos;
import toth.entities.StatusPagamento;

public record PagamentoCreateDto(
		String metodoPagamento,
		StatusPagamento statusPagamento,
		BigDecimal valor,
		LocalDateTime dataPagamento,
		String transacaoId,
		Pedidos pedido) {

}
