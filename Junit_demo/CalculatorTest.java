package com.example;

import org.junit.Test; // 4.12

import static junit.framework.TestCase.assertEquals;

public class CalculatorTest {

    @Test
    public void testAdd_small_numbers() {
        // Arrange
        Calculator calculator = new Calculator();

        // Act
        double actual_result = calculator.add(3, 4);

        // Assert
        // compare between actual result and expected result
        double expected_result = 7;

        assertEquals(expected_result, actual_result);

    }

    // test_min_...
    // test_mul_...
    // test_div_...
}
