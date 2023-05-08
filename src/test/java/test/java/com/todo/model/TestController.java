package test.java.com.todo.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import src.main.java.com.todo.controller.TaskController;

public class TestController {
    private TaskController taskController = new TaskController();
    
    @Test
    void testCreateTask() {
        taskController.createTask("Prueba", "Prueba JUnit");
        assertEquals(true, taskController.searchTask("Prueba"));
    }
    
    @Test
    void testReadTask() {
        taskController.createTask("Prueba", "Prueba JUnit");
        assertEquals(false, taskController.readTask("Prueba"));
    }
    
    @Test
    void testUpdateTask() {
        taskController.createTask("Prueba", "Prueba JUnit");
        taskController.updateTask("Prueba");
        assertEquals(true, taskController.readTask("Prueba"));
    }
    
    @Test
    void testDeleteTask() {
        taskController.createTask("Prueba", "Prueba JUnit");
        taskController.deleteTask("Prueba");
        assertEquals(false, taskController.searchTask("Prueba"));
    }
}
