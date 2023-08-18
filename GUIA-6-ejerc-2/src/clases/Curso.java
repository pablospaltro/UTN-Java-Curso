package clases;

import java.util.ArrayList;

import clases.Estudiante;

public class Curso {
	
	

	private ArrayList <Estudiante> estudiantes;
	
	public Curso() {
		estudiantes = new ArrayList<>();
	}
	


	public void agregarEstudiante(Estudiante estudiante) {
		estudiantes.add(estudiante);
	}
	
	public void mostrarEstudiante() {
		for (Estudiante i:estudiantes) {
			System.out.println(i);
		}
	}
	
	public void calcularPromedio() {
		double calificacion = 0;		
		for (Estudiante estudiante:estudiantes){
			calificacion += estudiante.getNota();
	}
		double promedio = calificacion/estudiantes.size();
		System.out.println("El promedio de notas de todos los estudiantes es " + promedio);
	}
	
	public void estudiantesAprobados() {
		for (Estudiante estudiante:estudiantes) {
			if (estudiante.getNota()>=3) {
			System.out.println(estudiante + " aprobó");
			} else {
				System.out.println(estudiante + " no aprobó");
			}
		}
	}
	}


