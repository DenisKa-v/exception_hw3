package org.example.task1;

import java.util.Scanner;

public interface PasswordService {
    void checkPassword(Scanner scanner, int count);

    String getConcolePassword(Scanner scanner, String password);
}
