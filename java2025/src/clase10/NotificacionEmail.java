package clase10;

public class NotificacionEmail extends Notificacion{

    private String destinatario;

    public NotificacionEmail(String mensaje, String destinatario) {
        super(mensaje);
        this.destinatario = destinatario;
    }

    @Override
    public void enviar() {
        System.out.println("Enviando correo a:" + destinatario);
        System.out.println("Mensaje:"+ mensaje);
        System.out.println("---Email Enviado----");
    }
}
