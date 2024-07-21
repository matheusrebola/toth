package br.org.gestao.toth.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record Carrinhos(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		Integer quantidade,
		LocalDateTime dataAdicao,
		boolean ativo) 
{

}
