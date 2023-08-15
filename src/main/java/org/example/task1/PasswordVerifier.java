package org.example.task1;

import java.util.Scanner;

public class PasswordVerifier implements PasswordService {
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public PasswordVerifier() {
    }

    public void passwordVerifier(String password) throws PasswordVerifierException {
        String sample1 = ".{8,}";
        String sample2 = ".*[0-9]+.*";
        String sample3 = ".*[A-ZА-ЯЁ]+.*";

        if (!password.matches(sample1)) {
            throw new PasswordVerifierException("Пароль должен быть не менее 8 символов.");
        } else if (!password.matches(sample2)) {
            throw new PasswordVerifierException("Пароль должен содержать хотя бы одну цифру.");
        } else if (!password.matches(sample3)) {
            throw new PasswordVerifierException("Пароль должен содержать хотя бы одну заглавную букву.");
        } else {
            System.out.println("Пароль действителен. Проверка пройдена успешно!");
        }
    }

    @Override
    public void checkPassword(Scanner scanner, int count) {
        int i = 0;
        while (i < count) {
            try {
                String password = getConcolePassword(scanner, "Введите пароль (у вас " + (count - i) + " попыток): ");
                passwordVerifier(password);
                break;

            } catch (PasswordVerifierException e) {
                i++;
                if (i == count) {
                    System.out.println("Ошибка: " + e.getMessage() + " У вас не осталось попыток.");
                } else {
                    System.out.println("Ошибка: " + e.getMessage() + " Повторите ввод, осталось " + (count - i) + " попыток.");
                }
            }
        }
    }

    @Override
    public String getConcolePassword(Scanner scanner, String message) {
        System.out.print(message);
        return scanner.next();
    }
}
