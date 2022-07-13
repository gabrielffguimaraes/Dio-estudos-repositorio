package dio.aula;

import dio.aula.model.Usuario;
import dio.aula.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AulaSpringDataJpaApplication {
	@Autowired
	private UsuarioRepository usuarioRepository;
	public static void main(String[] args) {
		SpringApplication.run(AulaSpringDataJpaApplication.class, args);
	}

	@Bean
	public CommandLineRunner appStart() {
		return args -> {
			Usuario usuario = new Usuario();
			usuario.setName("Carlos vieira .");
			usuario.setPassword("134652145");
			usuario.setUsername("Admin");
			usuarioRepository.save(usuario);

			usuarioRepository.findAll().forEach(u -> {
				System.out.println(u);
			});
		};
	}
}
