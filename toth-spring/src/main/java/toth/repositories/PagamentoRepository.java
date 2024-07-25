package toth.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import toth.entities.Pagamentos;

@Repository
public interface PagamentoRepository extends JpaRepository<Pagamentos, UUID> {

}
