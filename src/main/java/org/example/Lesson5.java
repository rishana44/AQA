package org.example;
public class Lesson5 {
    public static void main(String[] args) {
        // Задание №1
        Cat[] cat = new Cat[3];
        cat[0] = new Cat("Kasia", 4);
        cat[1] = new Cat("Eliza", 6);
        cat[2] = new Cat("Mitya", 8);
        cat[1].run(200);
        cat[1].swim(4);

        Dog dog = new Dog("Rex");
        dog.run(600);
        dog.swim(20);

        Plate plate = new Plate(25);

        for (Cat cats : cat) {
            cats.eat(plate);
            System.out.println(cats.getName() + " сытость: " + cats.isFullness());
        }

        // Добавить еды в тарелку
        plate.addFood(15);

        System.out.println("Всего еды: " + plate.getFood());
        System.out.println("Всего котов: " + Cat.getCount());
        System.out.println("Всего собак: " + Dog.getCount());
        System.out.println("Всего животных: " + Animal.getCount());

        // Задание №2
        Info circle = new Circle(5, "Red", "Black");
        Info rectangle = new Rectangle(4, 6, "Blue", "Green");
        Info triangle = new Triangle(3, 4, 5, "Yellow", "Pink");

        circle.printInfo();
        rectangle.printInfo();
        triangle.printInfo();
    }
}