package es.ebarrab.ejemplos.ejemplo20issuetracker.common.mappers;

import es.ebarrab.ejemplos.ejemplo20issuetracker.common.dto.api.AppUserDto;
import es.ebarrab.ejemplos.ejemplo20issuetracker.common.dto.api.ProjectDto;
import es.ebarrab.ejemplos.ejemplo20issuetracker.common.entities.AppUser;
import es.ebarrab.ejemplos.ejemplo20issuetracker.common.entities.Project;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {AppUserMapper.class})
public interface ProjectMapper {
    ProjectDto map(Project project);
}
