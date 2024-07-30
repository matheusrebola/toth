package toth.dtos;

import java.time.LocalDate;
import java.util.UUID;

import jakarta.validation.constraints.NotNull;
import toth.entities.TipoUsuario;

public record UsuarioDto(
		@NotNull UUID id,
		String nome,
		String email,
		String senha,
		LocalDate dataCriacao,
		TipoUsuario tipoUsuario,
		String telefone,
		String endereco) {

}
