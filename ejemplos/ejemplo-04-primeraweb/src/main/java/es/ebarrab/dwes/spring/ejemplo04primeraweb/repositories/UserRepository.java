package es.ebarrab.dwes.spring.ejemplo04primeraweb.repositories;

import es.ebarrab.dwes.spring.ejemplo04primeraweb.entities.User;

public interface UserRepository {
    User findUserByEmail(String email);
}
