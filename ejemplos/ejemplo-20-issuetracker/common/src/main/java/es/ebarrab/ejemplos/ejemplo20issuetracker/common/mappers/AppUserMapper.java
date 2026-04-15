package es.ebarrab.ejemplos.ejemplo20issuetracker.common.mappers;

import es.ebarrab.ejemplos.ejemplo20issuetracker.common.dto.api.AppRoleDto;
import es.ebarrab.ejemplos.ejemplo20issuetracker.common.dto.api.AppUserDto;
import es.ebarrab.ejemplos.ejemplo20issuetracker.common.entities.AppRole;
import es.ebarrab.ejemplos.ejemplo20issuetracker.common.entities.AppUser;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {AppRoleMapper.class})
public interface AppUserMapper {
    AppUserDto map(AppUser user);
}
