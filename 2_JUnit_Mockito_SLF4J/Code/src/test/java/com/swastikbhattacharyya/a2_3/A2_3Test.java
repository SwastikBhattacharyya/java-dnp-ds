package com.swastikbhattacharyya.a2_3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(OrderAnnotation.class)
public class A2_3Test {
  @Test
  @Order(2)
  void testB() {
    assertTrue(true);
  }

  @Test
  @Order(1)
  void testA() {
    assertEquals(1, 1);
  }

  @Test
  @Order(3)
  void testC() {
    assertFalse(false);
  }
}
