package toth.dtos;

import java.time.LocalDateTime;

public record CategoriaCreateDto(
		String nome,
		String descricao,
		LocalDateTime dataCriacao,
		Boolean ativo) {

}
