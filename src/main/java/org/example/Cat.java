package org.example;

class Cat extends Animal {
    private String name;
    private int appetite; // Кол-во еды, необходимое для насыщения
    private boolean fullness; // Сытость кота
    private static int count; // Всего котов
    private final int MAX_RUN_LENGTH = 300; // длинна препятствия
    @Override
    void run(int length) {
        if ((length >= 0) && (length <= MAX_RUN_LENGTH)) System.out.println("Кот пробежал " + length + "м.");
        else System.out.println("Кот не может пробежать");
    }
    @Override
    void swim(int length) {
        System.out.println("Кот не поплывет");
    }
    public static int getCount() {
        return count;
    }
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.fullness = false;
        count++;
    }
    // Кот поел
    public void eat(Plate plate) {
        if (!fullness && plate.decreaseFood(appetite)) {
            fullness = true;
        }
    }
    // Имя кота
    public String getName() {
        return name;
    }
    // Сытость кота
    public boolean isFullness() {
        return fullness;
    }
}

