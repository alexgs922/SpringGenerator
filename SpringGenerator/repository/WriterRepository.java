package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import domain.Writer;

@Repository
public interface WriterRepository extends JpaRepository<Writer, Integer> {
}