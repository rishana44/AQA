package org.example;
public class Homework_3a {
    public static void main(String[] args) {
        System.out.println(between10And20(10, 2));
        positiveOrNegative(-8);
        positiveOrNegative(15);
        System.out.println(isNegativOrPositive(-7));
        System.out.println(isNegativOrPositive(9));
        printLine("Hi", 2);
        System.out.println(leapYear(2024));
    }
    /** task.1
     * Написать метод, принимающий на вход два целых числа и проверяющий,
     * что их сумма лежит в пределах от 10 до 20 (включительно),
     * если да – вернуть true, в противном случае – false.
     */
    static boolean between10And20(int a, int b) {
        return a + b >=10 && a + b <=20;
    }
    /** task.2
     * Написать метод, которому в качестве параметра передается целое число,
     * метод должен напечатать в консоль, положительное ли число передали
     * или отрицательное. Замечание: ноль считаем положительным числом.
     */
    static void positiveOrNegative(int a) {
        System.out.println(a >= 0? "Positive" : "Negative");
    }
    /** task.3
     * 3. Написать метод, которому в качестве параметра передается целое число.
     * Метод должен вернуть true, если число отрицательное,
     * и вернуть false если положительное.
     */
    static boolean isNegativOrPositive(int a) {
        return a < 0;
    }
    /** task.4
     * Написать метод, которому в качестве аргументов передается строка
     * и число, метод должен отпечатать в консоль указанную строку,
     * указанное количество раз;
     */
    static void printLine(String line, int n) {
        for (int i = 0; i < n; i++)
            System.out.println(line);
    }
    /** task.5
     * Написать метод, который определяет, является ли год високосным,
     * и возвращает boolean (високосный - true, не високосный - false).
     * Каждый 4-й год является високосным, кроме каждого 100-го,
     * при этом каждый 400-й – високосный.
     */
    static boolean leapYear(int year) {
        return year % 100 != 0 && year % 4 == 0 || year % 400 ==0;
    }
}