package main;
import java.util.ArrayList;

import clases.Curso;
import clases.Estudiante;


public class App {

	public static void main(String[] args) {
		
		
	
		
		Curso curso = new Curso();
		
		Estudiante estudiante1 = new Estudiante("Juan", 23, 2);
		Estudiante estudiante2 = new Estudiante("Carla", 35, 8.50);
	
		curso.agregarEstudiante(estudiante1);
		curso.agregarEstudiante(estudiante2);
		
		curso.mostrarEstudiante();
		curso.calcularPromedio();
		curso.estudiantesAprobados();
	}


	

}
