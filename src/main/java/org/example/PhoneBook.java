package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class PhoneBook {
    private Map<String, List<String>> phoneBook;
    public PhoneBook() {
        phoneBook = new HashMap<>();
    }
    // Добавление в справочник:
    public void add(String surname,String phoneNumber) {
        phoneBook.computeIfAbsent(surname, k -> new ArrayList<>()).add(phoneNumber);
    }
    // Поиск по фамилии:
    public List<String> get(String surname) {
        return phoneBook.getOrDefault(surname, new ArrayList<>());
    }
    // Пример:
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Петровский", "+375447845781");
        phoneBook.add("Марченко", "+375293156085");
        phoneBook.add("Глушакова", "+375291189332");

        System.out.println("тел Петровского" + phoneBook.get("Петровский"));
        System.out.println("тел Марченко" + phoneBook.get("Марченко"));
        System.out.println("тел Глушаковой" + phoneBook.get("Глушакова"));

    }
}
