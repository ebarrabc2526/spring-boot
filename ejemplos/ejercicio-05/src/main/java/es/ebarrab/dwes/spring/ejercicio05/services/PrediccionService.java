package es.ebarrab.dwes.spring.ejercicio05.services;

import es.ebarrab.dwes.spring.ejercicio05.entities.Prediccion;

import java.util.List;

public interface PrediccionService {
    List<Prediccion> getPrediccionSemanal();
}
