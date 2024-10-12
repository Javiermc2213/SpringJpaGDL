package gt.edu.umg.biblioteca.GestionLibros;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = "gt.edu.umg.biblioteca")
@EnableJpaRepositories(basePackages = "gt.edu.umg.biblioteca.repository")
@EntityScan(basePackages = "gt.edu.umg.biblioteca.model")
public class GestionLibrosApplication {

    public static void main(String[] args) {
        SpringApplication.run(GestionLibrosApplication.class, args);
    }
}
