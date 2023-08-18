package excepciones;

public class ListaTareasVaciaException extends Exception {
    public ListaTareasVaciaException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "No se puede realizar esta acción, puesto que la lista de tareas está vacía. Asegúrese de completar su lista con tareas para poder realizar esta acción.";
    }

}