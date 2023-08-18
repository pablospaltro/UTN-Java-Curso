package excepciones;

public class TareaExistenteException extends Exception {
    public TareaExistenteException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Esta tarea ya existe en su lista.";
    }
}