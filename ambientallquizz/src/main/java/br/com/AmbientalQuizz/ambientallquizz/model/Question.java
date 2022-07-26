package br.com.AmbientalQuizz.ambientallquizz.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "quizz")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Question {

    private Long id;
    private String title;
    private String textOfQuestion;
    private int number;
    private int correctAnswer;

}
