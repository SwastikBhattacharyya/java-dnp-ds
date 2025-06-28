package com.swastikbhattacharyya.a1_3;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class A1_3Test {
  @Test
  public void assertions() {
    assertNull(null);
    assertTrue(true);
    assertFalse(false);

    int arr1[] = {1, 2, 3};
    int arr2[] = {1, 2, 3};
    assertArrayEquals(arr1, arr2);
  }
}
