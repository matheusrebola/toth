package toth.dtos;

import java.util.UUID;

import jakarta.validation.constraints.NotNull;
import toth.entities.Usuarios;

public record EnderecoDto(
		@NotNull UUID id,
		String endereco,
		String cidade,
		Character estado,
		String cep,
		String pais,
		Usuarios usuario,
		Boolean ativo) {

}
