package gt.edu.umg.biblioteca.service;

import gt.edu.umg.biblioteca.model.Libro;
import gt.edu.umg.biblioteca.repository.LibroRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroService {

    private final LibroRepository libroRepository;

    // Constructor inyectado por Spring para gestionar el repositorio
    public LibroService(LibroRepository libroRepository) {
        this.libroRepository = libroRepository;
    }

    // Método para obtener todos los libros
    public List<Libro> obtenerTodos() {
        return libroRepository.findAll();
    }

    // Método para guardar un libro
    public Libro guardarLibro(Libro libro) {
        return libroRepository.save(libro);
    }

    // Método para actualizar un libro
    public Libro actualizarLibro(Libro libro) {
        return libroRepository.save(libro);
    }

    // Método para eliminar un libro por su ID
    public void eliminarLibro(Long id) {
        libroRepository.deleteById(id);
    }

    // Método para obtener un libro por su ID
    public Libro obtenerPorId(Long id) {
        return libroRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Libro no encontrado"));
    }
}
