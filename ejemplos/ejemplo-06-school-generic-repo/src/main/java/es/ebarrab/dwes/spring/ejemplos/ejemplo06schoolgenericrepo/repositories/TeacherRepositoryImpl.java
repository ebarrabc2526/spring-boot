package es.ebarrab.dwes.spring.ejemplos.ejemplo06schoolgenericrepo.repositories;

import es.ebarrab.dwes.spring.ejemplos.ejemplo06schoolgenericrepo.entities.Teacher;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public class TeacherRepositoryImpl extends RepositoryImpl<UUID, Teacher> implements TeacherRepository {
}
