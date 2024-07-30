package toth.dtos;

import java.time.LocalDate;

import toth.entities.TipoUsuario;

public record UsuarioCreateDto(
		String nome,
		String email,
		String senha,
		LocalDate dataCriacao,
		TipoUsuario tipoUsuario,
		String telefone,
		String endereco) {

}
