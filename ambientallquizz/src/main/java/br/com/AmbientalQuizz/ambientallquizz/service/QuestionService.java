package br.com.AmbientalQuizz.ambientallquizz.service;


import br.com.AmbientalQuizz.ambientallquizz.dto.QuestionDto;
import br.com.AmbientalQuizz.ambientallquizz.model.Question;
import br.com.AmbientalQuizz.ambientallquizz.repository.QuestionRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class QuestionService {

    @Autowired
    private QuestionRepository repository;

    @Autowired
    private ModelMapper modelMapper;

    public Page<QuestionDto> getAll(Pageable pages){
        return repository
                .findAll(pages)
                .map(p -> modelMapper.map(p, QuestionDto.class));
    }



}
