package toth.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import toth.entities.Categorias;

@Repository
public interface CategoriaRepository extends JpaRepository<Categorias, UUID> {

}
