package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import domain.Correction;

@Repository
public interface CorrectionRepository extends JpaRepository<Correction, Integer> {
}