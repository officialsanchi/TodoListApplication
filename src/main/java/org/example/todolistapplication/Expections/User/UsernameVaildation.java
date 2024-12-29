package org.example.todolistapplication.Expections.User;

public class UsernameVaildation extends RuntimeException {
  public UsernameVaildation(String message) {
    super(message);
  }
}
