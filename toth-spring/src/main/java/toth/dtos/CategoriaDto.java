package toth.dtos;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.validation.constraints.NotNull;

public record CategoriaDto(
		@NotNull UUID id,
		String nome,
		String descricao,
		LocalDateTime dataCriacao,
		Boolean ativo) {

}
