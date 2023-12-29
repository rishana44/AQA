package org.example;
public class Park {
        public class Attraction {
            private String name;
            private String workingHours;
            private double price;
            public Attraction(String name, String workingHours, double price) {
                this.name = name;
                this.workingHours = workingHours;
                this.price = price;
            }
            public void displayInfo() {
                System.out.println("Аттракцион: " + name);
                System.out.println("Времяработы: " + workingHours);
                System.out.println("Цена: " + price + " руб.");
            }
        }
