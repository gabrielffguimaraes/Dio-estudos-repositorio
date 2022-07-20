package one.digitalinnovation;

public class Pedidos {
    private MensageriaService mensageriaService;

    public Pedidos(MensageriaService mensageriaService) {
        this.mensageriaService = mensageriaService;
    }

    public MensageriaService getMensageriaService() {
        return mensageriaService;
    }

    public void setMensageriaService(MensageriaService mensageriaService) {
        this.mensageriaService = mensageriaService;
    }
}
