package es.ebarrab.dwes.ejemplo02solid.principio05dip.correcto;

/**
 * Módulo de bajo nivel: clase que manda mensajes por SMS
 */
public class NotificadorSMS implements Notificador {
    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando SMS: " + mensaje);

    }
}