package org.example.todolistapplication.Expections;

public class TaskDoesNotExist extends RuntimeException {
    public TaskDoesNotExist(String message) {
        super(message);
    }
}
