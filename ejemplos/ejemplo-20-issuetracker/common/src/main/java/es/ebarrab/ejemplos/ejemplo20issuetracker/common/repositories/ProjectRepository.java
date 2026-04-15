package es.ebarrab.ejemplos.ejemplo20issuetracker.common.repositories;

import es.ebarrab.ejemplos.ejemplo20issuetracker.common.entities.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}