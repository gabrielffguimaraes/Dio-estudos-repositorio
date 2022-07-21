package org.gabrielffguimara;

public class EnvioSms {

    public EnvioSms() {

    }

    public static EnvioSms obterDadosSMS() {
        return new EnvioSms();
    }

    private void enviarSms() {
        System.out.println("Enviando sms...");
    }
}
