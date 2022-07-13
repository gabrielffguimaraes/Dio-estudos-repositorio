package Singleton.vs.Prototype.com.singlevsprototype.dio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	@Autowired
	private SistemaMensagens msgSystem;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner() {
		return args -> {
			System.out.println("##### STARTING #####");
			msgSystem.enviarConfirmacaoCadastro();
			msgSystem.enviarMensagemBoasVindas();
		};
	}
}
