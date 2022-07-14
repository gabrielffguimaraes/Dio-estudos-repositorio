package dio.springboot.app;

import com.google.gson.Gson;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import viacepservice.ConversorJson;

@Configuration
public class Config {

    @Bean
    public ConversorJson conversorJson() {
        return new ConversorJson();
    }
    @Bean
    public Gson gson() {
        return new Gson();
    }
}
