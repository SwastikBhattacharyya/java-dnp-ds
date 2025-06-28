package com.swastikbhattacharyya.a1_2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class A1_2Test {
  Calculator calculator;

  @BeforeEach
  public void beforeEach() {
    calculator = new Calculator();
  }

  @Test
  public void addTest() {
    assertEquals(calculator.add(1, 1), 2);
    assertEquals(calculator.add(2, 2), 4);
    assertEquals(calculator.add(6, 9), 15);
  }

  @Test
  public void subtractTest() {
    assertEquals(calculator.subtract(40, 1), 39);
    assertEquals(calculator.subtract(30, 2), 28);
    assertEquals(calculator.subtract(40, 7), 33);
  }

  @Test
  public void multiplyTest() {
    assertEquals(calculator.multiply(2, 3), 6);
    assertEquals(calculator.multiply(5, 2), 10);
    assertEquals(calculator.multiply(10, 5), 50);
  }

  @Test
  public void divideTest() {
    assertEquals(calculator.divide(30, 5), 6);
    assertEquals(calculator.divide(50, 5), 10);
    assertEquals(calculator.divide(49, 7), 7);
  }
}
