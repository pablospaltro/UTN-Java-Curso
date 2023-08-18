package entidades;
import excepciones.IndexOutOfBoundsException;
import excepciones.ListaTareasVaciaException;
import excepciones.TareaExistenteException;

public interface GestorTareas {
    public void agregarTarea() throws TareaExistenteException;

    public void marcarTareaComoCompletada() throws IndexOutOfBoundsException;

    public void eliminarTareas() throws ListaTareasVaciaException;

    public void mostrarTareas() throws ListaTareasVaciaException;
    
}