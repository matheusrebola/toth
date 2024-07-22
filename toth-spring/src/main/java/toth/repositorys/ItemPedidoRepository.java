package toth.repositorys;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import toth.entities.ItensPedido;

@Repository
public interface ItemPedidoRepository extends JpaRepository<ItensPedido, UUID> {

}
