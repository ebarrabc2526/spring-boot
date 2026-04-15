package es.ebarrab.springboot.ejemplos.ejemplo100springbootbasics.services;


import es.ebarrab.springboot.ejemplos.ejemplo100springbootbasics.dto.validation.NewPersonFormDto;

public interface PersonService {
    void create(NewPersonFormDto dto);
}
