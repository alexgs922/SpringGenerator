package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import domain.Work;

@Repository
public interface WorkRepository extends JpaRepository<Work, Integer> {
}