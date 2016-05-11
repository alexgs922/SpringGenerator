package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import domain.JournalisticText;

@Repository
public interface JournalisticTextRepository extends JpaRepository<JournalisticText, Integer> {
}