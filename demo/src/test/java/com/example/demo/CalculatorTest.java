package com.example.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    void testPenjumlahan() {
        assertEquals(5, calculator.tambah(2, 3), "2 + 3 harus bernilai 5");
        assertEquals(0, calculator.tambah(-1, 1), "Penjumlahan bilangan negatif");
        assertEquals(10, calculator.tambah(7, 3), "Penjumlahan bilangan positif");
    }

    @Test
    void testPengurangan() {
        assertEquals(-1, calculator.kurang(2, 3), "2 - 3 harus bernilai -1");
        assertEquals(0, calculator.kurang(5, 5), "Pengurangan bilangan sama");
        assertEquals(4, calculator.kurang(7, 3), "Pengurangan bilangan positif");
    }

    @Test
    void testPerkalian() {
        assertEquals(6, calculator.kali(2, 3), "2 * 3 harus bernilai 6");
        assertEquals(0, calculator.kali(0, 5), "Perkalian dengan nol");
        assertEquals(-12, calculator.kali(-3, 4), "Perkalian bilangan negatif");
    }

    @Test
    void testPembagian() {
        assertEquals(2.0, calculator.bagi(6, 3), "6 / 3 harus bernilai 2.0");
        assertEquals(2.5, calculator.bagi(5, 2), "Pembagian dengan pecahan");
        
        // Test pembagian dengan nol
        assertThrows(ArithmeticException.class, 
            () -> calculator.bagi(10, 0), 
            "Pembagian dengan nol harus menghasilkan ArithmeticException"
        );
    }
}
