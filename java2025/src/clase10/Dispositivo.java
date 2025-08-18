package clase10;

import java.util.ArrayList;
import java.util.List;

public class Dispositivo {

    public static void main(String[] args){
        List<Notificacion> notificaciones = new ArrayList<>();

        Notificacion email = new NotificacionEmail("Hola, como estas?", "prueba@gmail.com");
        Notificacion sms = new NotificacionSMS("Hola, SMS", "3865302030");

        notificaciones.add(email);
        notificaciones.add(sms);

        System.out.println("--Notificaciones--");
        for (Notificacion notificacion: notificaciones){
            notificacion.enviar();
            System.out.println();
        }
    }
}
