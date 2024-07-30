package toth.dtos;

import toth.entities.Usuarios;

public record EnderecoCreateDto(
		String endereco,
		String cidade,
		Character estado,
		String cep,
		String pais,
		Usuarios usuario,
		Boolean ativo) {

}
