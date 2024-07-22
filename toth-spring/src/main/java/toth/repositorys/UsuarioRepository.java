package toth.repositorys;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import toth.entities.Usuarios;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuarios, UUID>{

}
