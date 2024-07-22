package toth.repositorys;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import toth.entities.Enderecos;

@Repository
public interface EnderecoRepository extends JpaRepository<Enderecos, UUID> {

}
