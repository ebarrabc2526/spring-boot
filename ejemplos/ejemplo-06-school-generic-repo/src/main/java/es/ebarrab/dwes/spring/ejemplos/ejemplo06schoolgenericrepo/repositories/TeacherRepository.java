package es.ebarrab.dwes.spring.ejemplos.ejemplo06schoolgenericrepo.repositories;


import es.ebarrab.dwes.spring.ejemplos.ejemplo06schoolgenericrepo.entities.Teacher;

import java.util.UUID;

public interface TeacherRepository extends Repository<UUID, Teacher> {
}
