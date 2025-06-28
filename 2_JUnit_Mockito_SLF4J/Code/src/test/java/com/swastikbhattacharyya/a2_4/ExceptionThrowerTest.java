package com.swastikbhattacharyya.a2_4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ExceptionThrowerTest {
  @Test
  void testThrowsException() {
    assertThrows(IllegalArgumentException.class, ExceptionThrower::throwException);
  }
}
