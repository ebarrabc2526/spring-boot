package es.ebarrab.ejemplos.spring.ejemplo10schooljpa.repositories;

import es.ebarrab.ejemplos.spring.ejemplo10schooljpa.entities.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Integer> {
}
