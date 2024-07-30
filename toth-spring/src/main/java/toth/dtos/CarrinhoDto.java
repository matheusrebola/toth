package toth.dtos;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.validation.constraints.NotNull;

public record CarrinhoDto(
		@NotNull UUID id,
		Integer quantidade,
		LocalDateTime dataAdicao,
		Boolean ativo) {

}
