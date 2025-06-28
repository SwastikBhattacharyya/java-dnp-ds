package com.swastikbhattacharyya.a2_2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class EvenCheckerTest {
  @ParameterizedTest
  @ValueSource(ints = {2, 4, 6})
  void testEven(int n) {
    assertTrue(EvenChecker.isEven(n));
  }
}
