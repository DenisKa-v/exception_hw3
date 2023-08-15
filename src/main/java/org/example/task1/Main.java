package org.example.task1;

/*
Задача 1: Проверка пароля (Основы языка Java, операторы, ветвления)

Создайте класс PasswordVerifier. Этот класс должен содержать метод, который принимает строку пароля и проверяет его
на соответствие следующим правилам:

Пароль должен быть не менее 8 символов.
Пароль должен содержать хотя бы одну цифру.
Пароль должен содержать хотя бы одну заглавную букву.
Метод должен выбрасывать исключение, если пароль не соответствует какому-либо из этих правил.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PasswordVerifier passwordVerifier = new PasswordVerifier();
        Scanner scanner = new Scanner(System.in);
        passwordVerifier.checkPassword(scanner, 5);
    }
}
