package org.example;

abstract class Animal {
    private static int count;
    abstract void run(int length);
    abstract void swim(int length);
    public Animal() {
        count++;
    }
    public static int getCount() {
        return count;
    }
}