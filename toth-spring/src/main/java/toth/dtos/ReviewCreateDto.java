package toth.dtos;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import toth.entities.Produtos;
import toth.entities.Usuarios;

public record ReviewCreateDto(
		BigDecimal rating,
		String comentario,
		LocalDateTime dataCriacao,
		Produtos produto,
		Usuarios usuario) {

}
