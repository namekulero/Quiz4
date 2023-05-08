package src.main.java.com.todo.model;

import java.util.HashMap;

public class Model {
    private final HashMap<String, Task> taskMap = new HashMap<>();
    
    public void addTask(String title, String description) {
        Task newTask = new Task(title, description);
        taskMap.put(title, newTask);
    }
    
    public void updateTask(String title) {
        Task task = taskMap.get(title);
        task.setComplete();
        taskMap.put(title, task);
    }
    
    public void deleteTask(String title) {
        taskMap.remove(title);
    }

    public boolean readTask(String title) {
        Task task = taskMap.get(title);
        return task.isComplete();
    }

    public String getDescription(String title) {
        Task task = taskMap.get(title);
        return task.getDescription();
    }

    public boolean searchTask(String title) {
        return taskMap.containsKey(title);
    }
}
