package exce2;

public abstract class Tarea {
	
	String nombre;
	boolean completada;
	
	public Tarea(String nombre, boolean completada) {
		this.nombre = nombre;
		this.completada = completada;
	}
	
	
	
	abstract public void getNombre(); 
	abstract public void setNombre(); 
	
	abstract public void isCompletada(); 
	abstract public void setCompletada();
	
	abstract public String toString();
		


}
