package toth.dtos;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.validation.constraints.NotNull;
import toth.entities.Produtos;
import toth.entities.Usuarios;

public record ReviewDto(
		@NotNull UUID id,
		BigDecimal rating,
		String comentario,
		LocalDateTime dataCriacao,
		Produtos produto,
		Usuarios usuario) {

}
