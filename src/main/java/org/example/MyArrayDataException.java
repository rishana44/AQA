package org.example;
public class MyArrayDataException extends Exception {
    public int m;
    public int n;
    MyArrayDataException(int m, int n) {
        this.m = m;
        this.n = n;

    }

}
