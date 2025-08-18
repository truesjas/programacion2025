package clase10;

public class NotificacionSMS extends Notificacion{

    private String nroCelular;

    public NotificacionSMS(String mensaje, String nroCelular) {
        super(mensaje);
        this.nroCelular = nroCelular;
    }

    @Override
    public void enviar() {
        System.out.println("Enviando correo a:" + nroCelular);
        System.out.println("Mensaje:"+ mensaje);
        System.out.println("---SMS Enviado----");
    }
}
