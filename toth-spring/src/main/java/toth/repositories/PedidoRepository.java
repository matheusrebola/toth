package toth.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import toth.entities.Pedidos;

@Repository
public interface PedidoRepository extends JpaRepository<Pedidos, UUID> {

}
