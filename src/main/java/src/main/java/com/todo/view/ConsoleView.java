package src.main.java.com.todo.view;

import java.util.Scanner;
import src.main.java.com.todo.controller.TaskController;

public class ConsoleView {

    private static TaskController taskController = new TaskController();
    private static String title;
    private static String description;

    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Menú principal--");
            System.out.println("1. Crear tarea");
            System.out.println("2. Leer tarea");
            System.out.println("3. Actualizar tarea");
            System.out.println("4. Eliminar tarea");
            System.out.println("5. Cerrar programa\n");

            switch (sc.nextInt()) {
                default:
                    System.out.println("Ingrese un valor válido\n");
                    break;

                case 1:
                    System.out.println("Ingrese el nombre de la tarea:\n");
                    title = sc.next();
                    System.out.println("Ingrese la descripción de la tarea:\n");
                    description = sc.next();
                    taskController.createTask(title, description);
                    break;

                case 2:
                    System.out.println("Ingrese el nombre de la tarea que busca:\n");
                    title = sc.next();
                    if (taskController.searchTask(title)) {
                        System.out.println("Descripción de la tarea: " + taskController.getTaskDescription(title));
                        if (taskController.readTask(title)) {
                            System.out.println("La tarea ya ha sido completada\n");
                        } else {
                            System.out.println("La tarea aún no se ha completado\n");
                        }
                    } else {
                        System.out.println("El título de la tarea ingresada no se encontró en los datos almacenados\n");
                    }
                    break;
                    
                case 3:
                    System.out.println("Ingrese el nombre de la tarea que busca:\n");
                    title = sc.next();
                     if(!taskController.searchTask(title)) {
                        System.out.println("El título de la tarea ingresada no se encontró en los datos almacenados\n");
                    } if(taskController.readTask(title)) {
                        System.out.println("La tarea ingresada ya se ha completado previamente\n");
                    } if (taskController.searchTask(title) && !taskController.readTask(title)) {
                        taskController.updateTask(title);
                    }
                    
                    break;
                    
                case 4:
                    System.out.println("Ingrese el nombre de la tarea que busca:\n");
                    title = sc.next();
                    if(!taskController.searchTask(title)) {
                        System.out.println("El título de la tarea ingresada no se encontró en los datos almacenados\n");
                    } if (taskController.searchTask(title)) {
                        taskController.deleteTask(title);
                        System.out.println("La tarea ingresada se borró exitosamente\n");
                    } 
                    break;
                    
                case 5:
                    return;
            }
        }
    }
}
