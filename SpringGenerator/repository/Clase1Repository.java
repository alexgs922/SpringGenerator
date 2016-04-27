package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import domain.Clase1;

@Repository
public interface Clase1Repository extends JpaRepository<Clase1, Integer> {
}