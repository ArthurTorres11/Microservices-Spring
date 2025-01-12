package br.fsa.arthurtorres.schoolservice.repository;

import br.fsa.arthurtorres.schoolservice.model.School;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolRepository extends JpaRepository<School, Long> {
}
