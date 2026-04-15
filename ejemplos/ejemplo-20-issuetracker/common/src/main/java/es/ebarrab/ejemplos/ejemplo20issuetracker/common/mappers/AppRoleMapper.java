package es.ebarrab.ejemplos.ejemplo20issuetracker.common.mappers;

import es.ebarrab.ejemplos.ejemplo20issuetracker.common.dto.api.AppRoleDto;
import es.ebarrab.ejemplos.ejemplo20issuetracker.common.entities.AppRole;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AppRoleMapper {
    AppRoleDto map (AppRole role);
}
