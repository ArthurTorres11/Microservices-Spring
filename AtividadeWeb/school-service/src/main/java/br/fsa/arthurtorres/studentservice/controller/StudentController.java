package br.fsa.arthurtorres.studentservice.controller;

import br.fsa.arthurtorres.studentservice.model.Student;
import br.fsa.arthurtorres.studentservice.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentRepository repository;

    // Endpoint para listar todos os estudantes
    @GetMapping
    public List<Student> getAllStudents() {
        List<Student> students = repository.findAll();
        if (students.isEmpty()) {
            throw new RuntimeException("No students found. Please add some students.");
        }
        return students;
    }

    // Endpoint para adicionar um novo estudante
    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return repository.save(student);
    }

    // Endpoint para retornar uma mensagem padrão
    @GetMapping("/message")
    public String getMessage() {
        return "Welcome to the Student Service! Add some students to see them here.";
    }
}
