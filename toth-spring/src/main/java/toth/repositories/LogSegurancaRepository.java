package toth.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import toth.entities.LogsSeguranca;

@Repository
public interface LogSegurancaRepository extends JpaRepository<LogsSeguranca, UUID> {

}
