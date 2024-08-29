package org.example;

public class Main {
    public static void main(String[] args) {
        try {
            User.user("d1f","fdgf","fdgf");
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
        }catch (Exception e) {
            System.out.println("Ошибка " + e.getMessage());
        } finally {
            System.out.println("Проверка завершена");
        }
    }
}