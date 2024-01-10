package org.example;
public class Array {
    public static void main(String[] args) {
        String[][] arr = new String[][]{{"10", "11", "12", "13"}, {"13", "11", "10", "12"}, {"12", "10", "13", "11"},
                {"12", "11", "13", "10"}};

        try {
            try {
                int result = method(arr);
                System.out.println(result);
            } catch (MyArraySizeException e) {
                System.out.println("Превышен размер массива");
            }
        } catch (MyArrayDataException e) {
            System.out.println("Неправильное значение");
            System.out.println("Ошибка в ячейке: " + e.m + "x" + e.n);
        }
    }
    public static int method(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int count = 0;
        if (arr.length != 4) {
            throw new MyArraySizeException();
        }
        for (int m = 0; m < arr.length; m++) {
            if (arr[m].length != 4) {
                throw new MyArraySizeException();
            }
            for (int n = 0; n < arr[m].length; n++) {
                try {
                    count = count + Integer.parseInt(arr[m][n]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(m, n);
                }
            }
        }
        return count;
    }
}