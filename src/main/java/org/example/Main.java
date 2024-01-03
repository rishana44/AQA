package org.example
public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Irina Makarenko", "AQA", "rishana44@gmail.com", "654337", 2000, 30);
        person1.info();

        Person[] persArray = new Person[5];
        persArray[0] = new Person("Nadezhda Kozakova", "AQA", "kozakova@gmail.com", "563364", 1500, 26);
        persArray[1] = new Person("Petr Samoylov", "Python developer", "samoylov@mail.ru", "643783", 4000, 37);
        persArray[2] = new Person("Maksim Avdeev", "DevOps", "avd.maks@gmail.com", "644675", 3000, 35);
        persArray[3] = new Person("Anna Bogachova", "System Analyst", "annita666@gmail.com", "567354", 3600, 28);
        persArray[4] = new Person("Nikolay Potemov", "Data Analyst", "nikola84@mail.ru", "743367", 2500, 25);

        Park park = new Park();
        Park.Attraction rollerCoaster = park.new Attraction("Колесо обозрения", "09:00 - 20:00", 7.0);
        rollerCoaster.displayInfo();
       }
    }
