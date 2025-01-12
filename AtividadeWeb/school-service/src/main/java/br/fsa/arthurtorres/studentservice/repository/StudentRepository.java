package br.fsa.arthurtorres.studentservice.repository;

import br.fsa.arthurtorres.studentservice.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
