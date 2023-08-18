package GuiaExcepciones;

import java.util.ArrayList;
import java.util.List;
import TareaImpl;

public class GestorTareasImpl implements GestorTareas {

	List <String> tareas = new ArrayList<String>();
	
	
	
	
	@Override
	public void agregarTarea(TareaImpl tarea) {
		System.out.println(tare);
		
	}

	@Override
	public void marcarTarea() {
		System.out.println("Tarea marcada");
		
	}

	@Override
	public void eliminarTarea() {
		System.out.println("Tarea eliminada");
		
	}

	@Override
	public void mostrarTarea() {
		System.out.println("Tarea mostrada");
		
	}

}
