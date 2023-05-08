package src.main.java.com.todo.controller;

import src.main.java.com.todo.model.Model;

public class TaskController {
    private Model model = new Model();
    
    public void createTask(String title, String description) {
        model.addTask(title, description);
    }
    
    public boolean searchTask(String title) {
        return model.searchTask(title);
    }
    
    public boolean readTask(String title) {
        return model.readTask(title);
    }
    
    public String getTaskDescription(String title) {
        return model.getDescription(title);
    }
    
    public void deleteTask(String title) {
        model.deleteTask(title);
    }
    
    public void updateTask(String title) {
        model.updateTask(title);
    }
}
