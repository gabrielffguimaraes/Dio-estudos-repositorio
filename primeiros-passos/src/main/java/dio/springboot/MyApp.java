package dio.springboot;

import dio.springboot.app.Calculadora;
import org.springframework.context.annotation.Bean;
import viacepservice.ConversorJson;
import viacepservice.ViaCepResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyApp implements CommandLineRunner {
    @Autowired
    private Calculadora calculadora;

    @Autowired
    private ConversorJson cJson;

    public MyApp() {
    }

    @Override
    public void run(String... args) throws Exception {
        //System.out.println(calculadora.somar(1,5));

        ViaCepResponse viaCepResponse = cJson.converter("{ cep : '21832006' , logradouro : 'Rua' , localidade : 'Bairro'}");
        System.out.println(viaCepResponse);
    }
}
