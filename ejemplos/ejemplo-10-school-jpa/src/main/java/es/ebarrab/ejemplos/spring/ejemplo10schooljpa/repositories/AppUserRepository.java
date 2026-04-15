package es.ebarrab.ejemplos.spring.ejemplo10schooljpa.repositories;

import es.ebarrab.ejemplos.spring.ejemplo10schooljpa.entities.AppUser;
import org.springframework.data.repository.ListCrudRepository;

import java.util.Optional;

public interface AppUserRepository extends ListCrudRepository<AppUser, Long> {
    Optional<AppUser> findByEmailIgnoreCase(String email);

}
