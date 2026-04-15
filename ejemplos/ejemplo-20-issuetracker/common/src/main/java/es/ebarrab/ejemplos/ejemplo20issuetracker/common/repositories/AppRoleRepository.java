package es.ebarrab.ejemplos.ejemplo20issuetracker.common.repositories;

import es.ebarrab.ejemplos.ejemplo20issuetracker.common.entities.AppRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppRoleRepository extends JpaRepository<AppRole, Long> {
}