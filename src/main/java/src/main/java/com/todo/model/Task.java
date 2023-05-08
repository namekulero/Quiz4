package src.main.java.com.todo.model;

public class Task {
    private String title;
    private String description;
    private boolean status; // If true, the task is completed
    
    public Task(String title, String description) {
        this.title = title;
        this.description = description;
        this.status = false;
    }
    
    public void setComplete() {
        this.status = true;
    }
    
    public boolean isComplete() {
        return this.status;
    }
    
    public String getDescription() {
        return this.description;
    }
}
