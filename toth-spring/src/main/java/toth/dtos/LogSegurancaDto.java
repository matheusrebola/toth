package toth.dtos;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.validation.constraints.NotNull;

public record LogSegurancaDto(
		@NotNull UUID id,
		String acao,
		LocalDateTime data,
		String descricao) {

}
