package org.example.todolistapplication.Expections.User;

public class EmailValidation extends RuntimeException {
  public EmailValidation(String message) {
    super(message);
  }
}
