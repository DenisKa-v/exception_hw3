package org.example.task2;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

/**
 * Класс FileManager демонстрирует основные операции с файлами: чтение, запись и копирование.
 */
public class FileManager {

    /**
     * Метод для чтения файла
     * @param filePath полный путь к файлу.
     * @throws FileNotFoundException исключение, если файл не найден по указанному пути.
     */
    public static void readFile(String filePath) throws FileNotFoundException {

        File file = new File(filePath);
        if (!file.exists()) {
            throw new FileNotFoundException("Файл не найден:" + filePath);
        }


        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
            System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

     /**
     * Метод для записи файла
     * @param filePath полный путь к файлу.
     * @param content данные, которые записываются в файл
     * @throws FileNotFoundException исключение, если файл не найден по указанному пути.
     */
    public static void writeFile(String filePath, String content) throws FileNotFoundException {

        File file = new File(filePath);
        if (!file.exists()) {
            throw new FileNotFoundException("Файл не найден:" + filePath);
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Метод для копирования файла
     * @param sourcePath полный путь к копируемому файлу.
     * @param destinationPath полный путь, куда копируется файл.
     * @throws FileNotFoundException исключение, если копируемый файл не найден по указанному пути.
     */

    public static void copyFile(String sourcePath, String destinationPath) throws FileNotFoundException {

        File sourceFile = new File(sourcePath);
        if (!sourceFile.exists()) {
            throw new FileNotFoundException("Файл не найден:" + sourcePath);
        }

        File destinationFile = new File(destinationPath);

        try {
            Files.copy(sourceFile.toPath(), destinationFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
