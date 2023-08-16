package org.example.task2;

/*
Задача 2: Файловый менеджер (ООП, исключения)

Создайте класс FileManager. Этот класс должен иметь методы для выполнения основных операций с файлами:
чтение, запись и копирование. Каждый из этих методов должен выбрасывать соответствующее исключение, если
в процессе выполнения операции произошла ошибка (например, FileNotFoundException, если файл не найден).
 */

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        String sourceFilePath = "C:/file.txt";
        String destinationFilePath = "C:/file2.txt";

        // Чтение файла
        FileManager.readFile(sourceFilePath);

        // Запись файла
        String newContent = "Новое содержимое файла";
        FileManager.writeFile(sourceFilePath, newContent);
        System.out.println("Файл успешно записан.");

        // Копирование файла
        FileManager.copyFile(sourceFilePath, destinationFilePath);
        System.out.println("Файл успешно скопирован.");
    }
}
