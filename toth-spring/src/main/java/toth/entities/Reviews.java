package toth.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record Reviews(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		BigDecimal rating,
		String comentario,
		LocalDateTime dataCriacao,
		Produtos produto,
		Usuarios usuario) 
{

}
