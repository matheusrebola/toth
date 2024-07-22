package toth.entities;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record Enderecos(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		String endereco,
		String cidade,
		Character estado,
		String cep,
		String pais,
		Usuarios usuario,
		boolean ativo) 
{

}
