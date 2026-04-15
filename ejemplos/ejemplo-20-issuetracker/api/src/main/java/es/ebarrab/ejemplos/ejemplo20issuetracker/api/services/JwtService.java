package es.ebarrab.ejemplos.ejemplo20issuetracker.api.services;


public interface JwtService {
    String generateAccessToken(String username);
    String extractUsername(String token);
    boolean isTokenExpired(String token);
}
