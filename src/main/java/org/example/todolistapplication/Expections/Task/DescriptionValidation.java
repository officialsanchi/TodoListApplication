package org.example.todolistapplication.Expections.Task;

public class DescriptionValidation extends RuntimeException {
  public DescriptionValidation(String message) {
    super(message);
  }
}
