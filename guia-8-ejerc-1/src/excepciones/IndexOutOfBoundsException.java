package excepciones;

public class IndexOutOfBoundsException extends Exception {
    public IndexOutOfBoundsException(String mensaje) {
        super(mensaje);
    }

    @Override
    public String getMessage() {
        return "El número seleccionado está fuera de los límites de su lista de tareas. Asegúrese de ingresar un número válido.";
    }

}