package exampleinterfaces.books;


import java.util.List;


/**
 * Operaciones CRUD
 *   Buscar: todos: findAll
 *   Buscar: por id: findById
 *   Buscar: por rango de páginas: findAllByNumPagesBetween(min, max)
 *   Crear: create(book)
 *   Actualizar: update(book)
 *   Borrar: remove(id)
 * Creación de clase
 */
public interface BookService {
    //CRUD

    // Buscar todos los libros
    List<Book> findAll();

    //Buscar 1 libro por su id único
    Book findById(Long id);

    // Buscar por rango de páginas: 50 y 100
    List<Book>  findAllByNumPageBetween(Integer min, Integer max);

    // Crear/guardar libro en base de datos
    Book create();

    // actualizar libro existente
    Book update();

    //borrar
    boolean removeById(Long id);

}

