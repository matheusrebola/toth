package toth.dtos;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import toth.entities.Categorias;

public record ProdutoCreateDto(
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
