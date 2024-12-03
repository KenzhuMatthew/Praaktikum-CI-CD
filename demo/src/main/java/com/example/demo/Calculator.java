package com.example.demo;

public class Calculator {
    public int tambah(int a, int b) {
        return a + b;
    }
    
    public int kurang(int a, int b) {
        return a - b;
    }
    
    public int kali(int a, int b) {
        return a * b;
    }
    
    public double bagi(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Pembagian dengan nol tidak diizinkan");
        }
        return (double) a / b;
    }
}
