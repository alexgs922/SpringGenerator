package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import domain.Clase3;

@Repository
public interface Clase3Repository extends JpaRepository<Clase3, Integer> {
}