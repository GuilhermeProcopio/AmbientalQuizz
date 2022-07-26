package br.com.AmbientalQuizz.ambientallquizz.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class QuestionDto {
    private Long id;
    private String title;
    private String textOfQuestion;
    private int number;
    private int correctAnswer;
}
