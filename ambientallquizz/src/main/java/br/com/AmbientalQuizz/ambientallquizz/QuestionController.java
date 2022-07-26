package br.com.AmbientalQuizz.ambientallquizz;

import br.com.AmbientalQuizz.ambientallquizz.model.Question;
import br.com.AmbientalQuizz.ambientallquizz.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/question")
public class QuestionController {
    @Autowired
    private QuestionService questionService;

    @GetMapping("/allQuestion")
    public List<Question> findalAllQuestions(){
        return questionService.getAll();
    }


}
