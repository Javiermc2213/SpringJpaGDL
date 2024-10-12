package gt.edu.umg.biblioteca.repository;

import gt.edu.umg.biblioteca.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // Indica que es un componente de acceso a datos
public interface LibroRepository extends JpaRepository<Libro, Long> {
}
