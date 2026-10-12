package com.example.demo.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class CalculatorServiceTest {
    @InjectMocks
    private CalculatorService calculatorService;

    @Test
    void testAdd() {
        assertEquals(5, calculatorService.add(2, 3));
    }

    @Test
    void testSubtract() {
        assertEquals(2, calculatorService.subtract(5, 3));
    }

    @Test
    void testMultiply() {
        assertEquals(12, calculatorService.multiply(3, 4));
    }
}
