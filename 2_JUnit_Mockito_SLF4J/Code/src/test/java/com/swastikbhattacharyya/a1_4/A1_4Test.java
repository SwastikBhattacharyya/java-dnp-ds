package com.swastikbhattacharyya.a1_4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class A1_4Test {
  private Calculator calculator;

  @BeforeEach
  public void setUp() {
    calculator = new Calculator();
  }

  @AfterEach
  public void tearDown() {
    calculator = null;
  }

  @Test
  public void testAddition() {
    int a = 5;
    int b = 3;

    int result = calculator.add(a, b);

    assertEquals(8, result);
  }

  @Test
  public void testSubtraction() {
    int a = 10;
    int b = 4;

    int result = calculator.subtract(a, b);

    assertEquals(6, result);
  }

  @Test
  public void testMultiplication() {
    int a = 7;
    int b = 6;

    int result = calculator.multiply(a, b);

    assertEquals(42, result);
  }

  @Test
  public void testDivision() {
    double a = 15.0;
    double b = 3.0;

    double result = calculator.divide(a, b);

    assertEquals(5.0, result, 0.001);
  }
}
