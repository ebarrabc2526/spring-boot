package es.ebarrab.ejemplos.ejemplo20issuetracker.common.dto.api;

import es.ebarrab.ejemplos.ejemplo20issuetracker.common.entities.AppUser;
import es.ebarrab.ejemplos.ejemplo20issuetracker.common.entities.Comment;
import es.ebarrab.ejemplos.ejemplo20issuetracker.common.entities.IssueStatus;
import es.ebarrab.ejemplos.ejemplo20issuetracker.common.entities.Project;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class IssueDto {
    private Long issueId;
    private String title;
    private String description;
    private String status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private ProjectDto project;
    private AppUserDto reporter;
    private AppUserDto assignee;
}
