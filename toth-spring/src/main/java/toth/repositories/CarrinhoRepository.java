package toth.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import toth.entities.Carrinhos;

@Repository
public interface CarrinhoRepository extends JpaRepository<Carrinhos, UUID> {

}
