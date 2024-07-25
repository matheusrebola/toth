package toth.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import toth.entities.Reviews;

@Repository
public interface ReviewRepository extends JpaRepository<Reviews, UUID>{

}
