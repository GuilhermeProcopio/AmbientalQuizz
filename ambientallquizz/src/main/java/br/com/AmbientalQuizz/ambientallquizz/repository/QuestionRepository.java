package br.com.AmbientalQuizz.ambientallquizz.repository;

import br.com.AmbientalQuizz.ambientallquizz.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Long> {
}
