package gt.edu.umg.biblioteca.controller;

import gt.edu.umg.biblioteca.model.Libro;
import gt.edu.umg.biblioteca.service.LibroService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/libros")
@Tag(name = "Gestión de Libros", description = "Operaciones CRUD para gestionar los libros")
public class LibroController {

    private final LibroService libroService;

    public LibroController(LibroService libroService) {
        this.libroService = libroService;
    }

    @GetMapping
    @Operation(summary = "Obtener todos los libros")
    public List<Libro> obtenerTodos() {
        return libroService.obtenerTodos();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Obtener un libro por ID")
    public Libro obtenerPorId(@PathVariable Long id) {
        return libroService.obtenerPorId(id);
    }

    @PostMapping
    @Operation(summary = "Guardar un nuevo libro")
    public Libro guardarLibro(@RequestBody Libro libro) {
        return libroService.guardarLibro(libro);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Actualizar un libro existente")
    public Libro actualizarLibro(@PathVariable Long id, @RequestBody Libro libro) {
        libro.setId(id);
        return libroService.actualizarLibro(libro);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Eliminar un libro por ID")
    public void eliminarLibro(@PathVariable Long id) {
        libroService.eliminarLibro(id);
    }
}
