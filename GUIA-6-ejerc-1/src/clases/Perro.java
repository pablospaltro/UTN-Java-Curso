package clases;

public class Perro extends Animal {
	
	private String raza;	
	
	public Perro(String nombre, int edad, String raza) {
		super(nombre, edad);
		this.raza=raza;		
	}
	
	
	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}


	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return super.getNombre();
	}


	@Override
	public void setNombre(String nombre) {
		// TODO Auto-generated method stub
		super.setNombre(nombre);
	}


	@Override
	public int getEdad() {
		// TODO Auto-generated method stub
		return super.getEdad();
	}


	@Override
	public void setEdad(int edad) {
		// TODO Auto-generated method stub
		super.setEdad(edad);
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "raza=" + raza + "]";
	}
	
	

	
}
