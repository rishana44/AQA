package org.example;
public class Main {
    public static void main(String[] args) {
        Box<Orange> boxOfOranges = new Box<>(new Orange(), 2);
        Box<Orange> boxOfOranges2 = new Box<>();
        Box<Apple> boxOfApples = new Box<>();
        Apple apple = new Apple();
        boxOfApples.addFruit(apple, 3);
        //сравнить коробку апельсинов и яблок
        System.out.println(boxOfOranges.compare(boxOfApples));
        //сравнить 2 коробки апельсинов
        System.out.println(boxOfOranges2.compare(boxOfOranges));
        //пересыпать апельсины
        boxOfOranges.pourInto(boxOfOranges2);
        System.out.println(boxOfOranges2.getWeight());
    }
}