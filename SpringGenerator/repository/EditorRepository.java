package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import domain.Editor;

@Repository
public interface EditorRepository extends JpaRepository<Editor, Integer> {
}