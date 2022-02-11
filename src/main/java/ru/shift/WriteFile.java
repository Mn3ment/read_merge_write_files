package ru.shift;

import java.io.FileWriter;
import java.io.Writer;

public class WriteFile {
    public static void fileWriter(int[] data, String fileName) {
        try {
            Writer writer = new FileWriter(fileName);
            for (int datum : data) {
                writer.write(datum + System.lineSeparator());
            }
            writer.close();
        } catch (Exception e) {
            System.err.println("Что-то не так - " + e.getMessage());
        }
    }

    public static void fileWriter(String[] data, String fileName) {
        try {
            Writer writer = new FileWriter(fileName);
            for (String datum : data) {
                writer.write(datum + System.lineSeparator());
            }
            writer.close();
        } catch (Exception e) {
            System.err.println("Что-то не так - " + e.getMessage());
        }
    }

}
