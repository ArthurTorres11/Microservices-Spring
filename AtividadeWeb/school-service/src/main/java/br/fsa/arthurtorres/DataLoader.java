package br.fsa.arthurtorres;

import br.fsa.arthurtorres.schoolservice.model.School;
import br.fsa.arthurtorres.schoolservice.repository.SchoolRepository;
import br.fsa.arthurtorres.studentservice.model.Student;
import br.fsa.arthurtorres.studentservice.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class DataLoader {

    @Autowired
    private SchoolRepository schoolRepository;

    @Autowired
    private StudentRepository studentRepository;

    @PostConstruct
    public void loadInitialData() {
        // Carrega dados iniciais para o repositório de escolas
        schoolRepository.save(new School("Escola Exemplo", "Rua Exemplo, 123"));
        schoolRepository.save(new School("Escola Secundária", "Av. Secundária, 456"));

        // Carrega dados iniciais para o repositório de estudantes
        studentRepository.save(new Student("João Silva", "A"));
        studentRepository.save(new Student("Maria Souza", "B"));
    }
}
