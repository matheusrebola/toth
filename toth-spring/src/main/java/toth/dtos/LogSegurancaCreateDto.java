package toth.dtos;

import java.time.LocalDateTime;

public record LogSegurancaCreateDto(
		String acao,
		LocalDateTime data,
		String descricao) {

}
