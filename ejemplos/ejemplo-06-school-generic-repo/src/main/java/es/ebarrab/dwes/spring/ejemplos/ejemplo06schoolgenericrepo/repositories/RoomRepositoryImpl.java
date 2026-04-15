package es.ebarrab.dwes.spring.ejemplos.ejemplo06schoolgenericrepo.repositories;

import es.ebarrab.dwes.spring.ejemplos.ejemplo06schoolgenericrepo.entities.Room;
import org.springframework.stereotype.Repository;

@Repository
public class RoomRepositoryImpl extends RepositoryImpl<String, Room> implements RoomRepository {
}
