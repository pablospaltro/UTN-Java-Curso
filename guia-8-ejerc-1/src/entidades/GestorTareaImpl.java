package entidades;
import excepciones.IndexOutOfBoundsException;
import excepciones.TareaExistenteException;
import excepciones.ListaTareasVaciaException;
import java.util.Scanner;

import java.util.ArrayList;

public class GestorTareaImpl implements GestorTareas {

    private ArrayList<TareaImpl> tareas;

    Scanner scanner = new Scanner(System.in);

    public GestorTareaImpl() {
        this.tareas = new ArrayList<>();
    }

    @Override
    public void agregarTarea() throws TareaExistenteException {
        TareaImpl tarea = new TareaImpl();
        System.out.println("Ingrese la tarea que desee agregar:");
        String nombre = scanner.next();
        for (TareaImpl tareaImpl : tareas) {
            if (tareaImpl.getNombre().equalsIgnoreCase(nombre)) {
                throw new TareaExistenteException("Esta tarea ya existe en su lista");
            }
        }
        tarea.setNombre(nombre);
        tarea.setCompletado(false);
        tareas.add(tarea);

    }

    @Override
    public void marcarTareaComoCompletada() throws IndexOutOfBoundsException {
        int index = 0;
        if (tareas.size() < 1) {
            System.out.println("No hay tareas pendientes");
        } else {
            System.out.println("Seleccione el número de la tarea que desea completar:");
            for (TareaImpl tareaImpl : tareas) {
                index += 1;
                System.out.println(index + ". " + tareaImpl);
            }
        }
        int menu = scanner.nextInt();

        if (menu > tareas.size()) {
            throw new IndexOutOfBoundsException("Número de tarea excedido");
        } else {
            tareas.get((menu - 1)).setCompletado(true);
            System.out.println("Tarea completada. ¡Bravo!");
        }
    }

    @Override
    public void eliminarTareas() throws ListaTareasVaciaException {
        int index = 0;
        if (tareas.size() < 1) {
            throw new ListaTareasVaciaException("No hay tareas cargadas.");
        } else {
            System.out.println("Seleccione el número de la tarea que desea eliminar:");
            for (TareaImpl tareaImpl : tareas) {
                index += 1;
                System.out.println(index + ". " + tareaImpl);
            }
        }
        int menu = scanner.nextInt();

        tareas.remove((menu - 1));
        System.out.println("Tarea eliminada.");
    }

    @Override
    public void mostrarTareas() throws ListaTareasVaciaException {    	
        int index=0;
        if (tareas.size() < 1) {
            throw new ListaTareasVaciaException("No hay tareas cargadas.");
        } else {
            System.out.println("Estas son sus tareas:");
            for (TareaImpl tareaImpl : tareas) {
                index += 1;
                System.out.println(index + ". " + tareaImpl);
            }
        }
    }

}