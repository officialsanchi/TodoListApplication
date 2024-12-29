package org.example.todolistapplication.Expections.User;

public class UserNotFound extends RuntimeException {
  public UserNotFound(String message) {
    super(message);
  }
}
