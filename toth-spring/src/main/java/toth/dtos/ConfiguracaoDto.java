package toth.dtos;

import java.util.UUID;

import jakarta.validation.constraints.NotNull;

public record ConfiguracaoDto(
		@NotNull UUID id,
		String chave,
		String valor,
		String descricao) {

}
