package es.ebarrab.dwes.ejemplo02solid.principio05dip.correcto;

/**
 * Módulo de bajo nivel: clase que manda mensajes por email
 */
public class NotificadorEmail implements Notificador {
    public void enviar(String mensaje) {
        System.out.println("Enviando email: " + mensaje);
    }
}