package org.example.todolistapplication.Expections;

public class SearchNotFound extends RuntimeException {
    public SearchNotFound(String message) {
        super(message);
    }
}
