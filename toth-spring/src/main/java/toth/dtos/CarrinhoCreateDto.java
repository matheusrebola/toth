package toth.dtos;

import java.time.LocalDateTime;

public record CarrinhoCreateDto(
		Integer quantidade,
		LocalDateTime dataAdicao,
		Boolean ativo) {

}
