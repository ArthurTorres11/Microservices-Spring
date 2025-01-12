package br.fsa.arthurtorres.schoolservice.controller;

import br.fsa.arthurtorres.schoolservice.model.School;
import br.fsa.arthurtorres.schoolservice.repository.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/school")
public class SchoolController {

    @Autowired
    private SchoolRepository repository;

    // Endpoint para listar todas as escolas
    @GetMapping
    public List<School> getAllSchools() {
        List<School> schools = repository.findAll();
        if (schools.isEmpty()) {
            throw new RuntimeException("No schools found. Please add some schools.");
        }
        return schools;
    }

    // Endpoint para adicionar uma nova escola
    @PostMapping
    public School createSchool(@RequestBody School school) {
        return repository.save(school);
    }

    // Endpoint para retornar uma mensagem padrão
    @GetMapping("/message")
    public String getMessage() {
        return "Welcome to the School Service! Add some schools to see them here.";
    }
}
