package main;
import java.util.Scanner;

import entidades.GestorTareaImpl;
import entidades.GestorTareas;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        int menu = 1;
        GestorTareas gestor = new GestorTareaImpl();

        while (menu != 5) {
            System.out.println("");
            System.out.println("¿Qué opción desea ejecutar?:");
            System.out.println("1. Agregar una tarea");
            System.out.println("2. Marcar una tarea como completada");
            System.out.println("3. Eliminar una tarea de la lista");
            System.out.println("4. Mostrar todas las tareas");
            System.out.println("5. Salir de la app");
            System.out.println("");
            menu = scanner.nextInt();

            if (menu == 1) {
                gestor.agregarTarea();
            }
            if (menu == 2) {
                gestor.marcarTareaComoCompletada();
            }
            if (menu == 3) {
                gestor.eliminarTareas();
            }
            if (menu == 4) {
                gestor.mostrarTareas();
            }
        }
    }
}