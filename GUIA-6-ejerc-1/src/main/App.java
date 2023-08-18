package main;
import clases.Animal;
import clases.Perro;
import clases.Gato;
import clases.Veterinario;

public class App {

	public static void main(String[] args) {
		
		Perro perro1 = new Perro("Juan", 5, "callejero");
		Perro perro2 = new Perro("Chiqui", 3, "dalmata");
		
		Gato gato1 = new Gato("Juan", 5, "peludo");
		Gato gato2 = new Gato("Chiqui", 3, "persa");
		
		Veterinario vet1 = new Veterinario();
		
		System.out.println("El nombre del primer perro es " + perro1.getNombre());
		
		vet1.curar(perro1);
		vet1.curar(gato2);

	}
}
