package es.ebarrab.ejemplos.ejemplo20issuetracker.common.repositories;

import es.ebarrab.ejemplos.ejemplo20issuetracker.common.entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}