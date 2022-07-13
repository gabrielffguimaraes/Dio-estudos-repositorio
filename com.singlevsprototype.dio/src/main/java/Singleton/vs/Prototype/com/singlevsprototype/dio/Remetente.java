package Singleton.vs.Prototype.com.singlevsprototype.dio;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Remetente {
    private String remetente;
    private String email;

    public Remetente() {}
    public Remetente(String remetente, String email) {
        this.remetente = remetente;
        this.email = email;
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
                "remetente:'" + remetente + '\'' +
                ", email:'" + email + '\'' +
                '}';
    }
}
