package ru.shift;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public static int[] fileReader(String fileName) {
        List<String> list1 = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))){
            String line = bufferedReader.readLine();
            while (line != null) {
                for (int i = 0; i < line.length(); i++) {
                    if (!Character.isDigit(line.charAt(i))) {
                        line = "0";
                    }
                }
                list1.add(line);
                line = bufferedReader.readLine();
            }
        } catch (Exception e) {
            System.err.println("Что-то пошло не так - " + e.getMessage());
        }
        return list1.stream().mapToInt(Integer::parseInt)
                .toArray();
    }

    public static String[] fileReaderForString(String fileName) {
        List<String> list = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))){
            String line = bufferedReader.readLine();
            while (line != null) {
                list.add(line);
                line = bufferedReader.readLine();
            }
        } catch (Exception e) {
            System.err.println("Что-то пошло не так - " + e.getMessage());
        }
        return list.toArray(new String[0]);
    }
}
