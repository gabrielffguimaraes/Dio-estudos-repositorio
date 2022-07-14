package viacepservice;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import viacepservice.ViaCepResponse;

public class ConversorJson {
    private String titulo;
    @Autowired
    private Gson gson;

    public ViaCepResponse converter(String json) {
        ViaCepResponse response = gson.fromJson(json,ViaCepResponse.class);
        return response;
    }

    public ConversorJson(String titulo) {
        this.titulo = titulo;
    }
    public ConversorJson() {

    }
}
