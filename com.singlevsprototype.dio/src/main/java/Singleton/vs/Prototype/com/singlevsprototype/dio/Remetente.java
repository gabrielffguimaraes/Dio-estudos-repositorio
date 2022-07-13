package Singleton.vs.Prototype.com.singlevsprototype.dio;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@ConfigurationProperties(prefix = "remetente")
public class Remetente {

    private String remetente;

    private String email;

    private String mensagemPadrao;

    public String getMensagemPadrao() {
        return mensagemPadrao;
    }

    public void setMensagemPadrao(String mensagemPadrao) {
        this.mensagemPadrao = mensagemPadrao;
    }

    public String getRemetente() {
        return remetente;
    }

    public void setRemetente(String remetente) {
        this.remetente = remetente;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "{" +
                "remetente : '" + remetente + '\'' +
                ", email : '" + email + '\'' +
                ", mensagemPadrao : '" + mensagemPadrao + '\'' +
                '}';
    }
}
