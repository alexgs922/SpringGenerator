package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import domain.LetterToEditor;

@Repository
public interface LetterToEditorRepository extends JpaRepository<LetterToEditor, Integer> {
}