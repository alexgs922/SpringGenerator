package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import domain.Draft;

@Repository
public interface DraftRepository extends JpaRepository<Draft, Integer> {
}