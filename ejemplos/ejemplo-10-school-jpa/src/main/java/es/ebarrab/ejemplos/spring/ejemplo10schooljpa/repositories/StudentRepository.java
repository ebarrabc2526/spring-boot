package es.ebarrab.ejemplos.spring.ejemplo10schooljpa.repositories;

import es.ebarrab.ejemplos.spring.ejemplo10schooljpa.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
