package com.enigmacamp.java.maven.app;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test Calculator")
class CalculatorTest {

    private Calculator calculator = new Calculator();

    @BeforeEach
    public void setUp() {
        System.out.println("Before each test");
    }

    @AfterEach
    public void tearDown() {
        System.out.println("After each test");
    }

    @Test
    @DisplayName("Test skenario sukses penjumlahan")
    public void testAddSuccess() {
        var result = calculator.add(10, 10);
        assertEquals(20, result);
    }

    @Test
    @DisplayName("Test skenario sukses tidak bisa dibagi dengan nol")
    public void testDivideFailed() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(10, 0);
        });
    }
}