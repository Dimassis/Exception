package org.example;

public class User {
    public static void user(String login, String password, String confirmPassword) throws WrongLoginException ,WrongPasswordException {
            if (login.length() > 20 ) {
                throw new WrongLoginException("Логин должен содержать не более 20 символов");
            }
            if(!login.matches("^[a-zA-Z0-9_]+$")) {
                throw new WrongLoginException("Некорретный логин");
            }
            if (password.length() > 20 || !password.matches("^[a-zA-Z0-9_]+$")) {
                throw new WrongPasswordException("Некорретный пароль");
            }
            if (!password.equals(confirmPassword)) {
                throw new WrongLoginException("Пароли не совпадают");
            }
            System.out.println("Данные введены верно");
    }
}

class WrongLoginException extends Exception {
    public WrongLoginException(String message) {
        super(message);
    }
}

class WrongPasswordException extends Exception {
    public WrongPasswordException(String message) {
        super(message);
    }
}