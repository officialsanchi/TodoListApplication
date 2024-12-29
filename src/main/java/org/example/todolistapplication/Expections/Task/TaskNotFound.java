package org.example.todolistapplication.Expections;

public class TaskNotFound extends RuntimeException {
    public TaskNotFound(String message) {
        super(message);

    }
}
