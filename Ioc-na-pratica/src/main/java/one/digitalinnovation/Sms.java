package one.digitalinnovation;

public class Sms implements MensageriaService{
    @Override
    public boolean enviarMensagem(String mensagem) {
        System.out.println("Enviando mensagem de sms :");
        System.out.println(mensagem);
        return false;
    }
}
