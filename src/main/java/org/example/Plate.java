package org.example;

public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    // Уменьшить кол-во еды в тарелке
    public boolean decreaseFood(int amount) {
        if (amount <= food) {
            food -= amount;
            return true;
        }
        return false; //
    }
    // Добавить кол-во еды в тарелку
    public void addFood(int amount) {
        food += amount;
    }
    // Кол-во еды в тарелке
    public int getFood() {
        return food;
    }
}
