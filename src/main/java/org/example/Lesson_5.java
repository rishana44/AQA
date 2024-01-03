package org.example;
public class Lesson_5 {
    public static void main(String[] args) {
        // Task 1
        Cat[] cat = new Cat[3];
        cat[0] = new Cat("Kitty", 5);
        cat[1] = new Cat("Kasia", 10);
        cat[2] = new Cat("Mitya", 15);
        cat[1].run(200);
        cat[1].swim(1);

        Dog dog = new Dog("Reks");
        dog.run(500);
        dog.swim(10);

        Plate plate = new Plate(25);

        for (Cat cats : cat) {
            cats.eat(plate);
            System.out.println(cats.getName() + " сытость: " + cats.isFullness());
        }

        // добавить еды в тарелку
        plate.addFood(15);
        System.out.println("Еды в тарелке после добавления: " + plate.getFood());
        System.out.println("Всего котов создано: " + Cat.getCount());
        System.out.println("Всего собак создано: " + Dog.getCount());
        System.out.println("Всего животных создано: " + Animal.getCount());

        // Task 2
        Info circle = new Circle(5, "White", "Green");
        Info rectangle = new Rectangle(4, 6, "Rose", "Purple");
        Info triangle = new Triangle(3, 4, 5, "Grey", "Red");

        circle.printInfo();
        rectangle.printInfo();
        triangle.printInfo();
    }
}

