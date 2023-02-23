package exampleinterfaces.patients;

import java.util.Map;

/**
 * Operaciones CRUD
 *   Buscar: todos: findAll
 *   Buscar: por id: findById
 *   Buscar: por rango de fechas: findClinicFolder(min, max)
 *   Crear: create(Patient)
 *   Actualizar: update(Patient)
 *   Borrar: remove(tis)
 * Creación de clase
 */
public interface PatientService {

    Map<String, Patient> findAll();

    Patient findByTis(String tis);

    Patient create(Patient patient);

    Patient update(Patient patient);

    boolean removeByTis(String tis);
}
