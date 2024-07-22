package toth.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record Produtos(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		String nome,
		String descricao,
		BigDecimal preco,
		Integer quantidadeEstoque,
		LocalDateTime dataCriacao,
		LocalDateTime dataAtualizacao,
		String imagemUrl,
		Categorias categoria,
		boolean ativo) 
{

}
