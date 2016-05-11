package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import domain.News;

@Repository
public interface NewsRepository extends JpaRepository<News, Integer> {
}