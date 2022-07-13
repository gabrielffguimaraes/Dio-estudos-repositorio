package Singleton.vs.Prototype.com.singlevsprototype.dio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SistemaMensagens {
    @Autowired
    private Remetente noreply;

    @Autowired
    private Remetente techTeam;

    public void enviarConfirmacaoCadastro() {
        System.out.println(noreply);
    }
    public void enviarMensagemBoasVindas() {
        techTeam.setEmail("techteam@gmail.com");
        techTeam.setRemetente("techclever");
        System.out.println(noreply);
        System.out.println(techTeam);
        System.out.println("Seja bem vindo à Tech TEAM !");
    }
}
