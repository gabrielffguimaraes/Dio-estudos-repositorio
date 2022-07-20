package one.digitalinnovation;

public class Emails implements MensageriaService{
    public boolean enviarMensagem(String mensagem) {
        System.out.println("Enviando mensagem de email :");
        System.out.println(mensagem);
        return true;
    }
}
