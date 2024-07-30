package toth.dtos;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.validation.constraints.NotNull;
import toth.entities.Categorias;

public record ProdutoDto(
		@NotNull UUID id,
		String nome,
		String descricao,
		BigDecimal preco,
		Integer quantidadeEstoque,
		LocalDateTime dataCriacao,
		LocalDateTime dataAtualizacao,
		String imagemUrl,
		Categorias categoria,
		Boolean ativo) {

}
