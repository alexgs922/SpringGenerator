package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import domain.Clase2;

@Repository
public interface Clase2Repository extends JpaRepository<Clase2, Integer> {
}