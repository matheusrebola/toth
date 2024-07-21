package br.org.gestao.toth.repositorys;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.org.gestao.toth.entities.Configuracoes;

@Repository
public interface ConfiguracaoRepository extends JpaRepository<UUID, Configuracoes> {

}
