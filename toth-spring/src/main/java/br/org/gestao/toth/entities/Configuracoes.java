package br.org.gestao.toth.entities;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record Configuracoes(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		String chave,
		String valor,
		String descricao) 
{

}
