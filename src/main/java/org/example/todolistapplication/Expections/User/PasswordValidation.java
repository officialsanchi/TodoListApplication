package org.example.todolistapplication.Expections.User;

public class PasswordValidation extends RuntimeException {
  public PasswordValidation(String message) {
    super(message);
  }
}
