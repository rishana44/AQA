package org.example;

import java.io.*;
import java.util.*;
public class Lesson_6 {
    public static void main(String[] args) {
        AppData appData = new AppData();
        // Инициализировать данные
        appData.setHeader(new String[]{"Val1", "Val2", "Val3"});
        appData.setData(new int[][]{
                {100, 200, 123},
                {300, 400, 500},
        });
        // Сохранить данные в файл
        try {
            appData.save("data.csv");
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Загрузить данные из файла
        AppData newData = new AppData();
        try {
            newData.load("data.csv");
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Вывод загруженных данных в консоль (для проверки)
        System.out.println(Arrays.toString(newData.getHeader()));
        for (int[] row : newData.getData()) {
            System.out.println(Arrays.toString(row));
        }
    }
}