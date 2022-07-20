package one.digitalinnovation;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        MensageriaService servicoDeMensagem = new Sms();
        Pedidos pedidos = new Pedidos(servicoDeMensagem);
        pedidos.getMensageriaService().enviarMensagem("Envia mensagem atráves dos sms ");
    }
}
