package es.ebarrab.springboot.ejemplos.ejemplo100springbootbasics.services;


import es.ebarrab.springboot.ejemplos.ejemplo100springbootbasics.dto.DateAndTimeFormDto;
import es.ebarrab.springboot.ejemplos.ejemplo100springbootbasics.dto.MultipleOptionFormDto;
import es.ebarrab.springboot.ejemplos.ejemplo100springbootbasics.dto.OptionFormDto;
import es.ebarrab.springboot.ejemplos.ejemplo100springbootbasics.dto.SimpleFormDto;
import es.ebarrab.springboot.ejemplos.ejemplo100springbootbasics.models.common.AgeRange;
import es.ebarrab.springboot.ejemplos.ejemplo100springbootbasics.models.common.Hobby;

import java.util.List;

public interface DataGeneratorService {
    List<AgeRange> getAllAgeRanges();

    Integer getRandomAgeRangeId();

    List<Hobby> getAllHobbies();

    Integer getRandomHobbyId();

    List<Integer> getRandomHobbyIds();

    SimpleFormDto createFakeSimpleFormDto();

    OptionFormDto createFakeOptionFormDto();

    MultipleOptionFormDto createFakeMultipleOptionFormDto();

    DateAndTimeFormDto createFakeDateAndTimeFormDto();
}
