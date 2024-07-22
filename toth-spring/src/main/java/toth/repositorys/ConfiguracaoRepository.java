package toth.repositorys;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import toth.entities.Configuracoes;

@Repository
public interface ConfiguracaoRepository extends JpaRepository<Configuracoes, UUID> {

}
