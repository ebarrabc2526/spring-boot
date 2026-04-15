package es.ebarrab.dwes.ejemplo02solid.principio05dip.incorrecto;

/**
 * Módulo de bajo nivel: clase que manda mensajes por SMS
 */
public class NotificadorSMS {
    public void enviar(String mensaje) {
        System.out.println("Enviando SMS: " + mensaje);
    }
}