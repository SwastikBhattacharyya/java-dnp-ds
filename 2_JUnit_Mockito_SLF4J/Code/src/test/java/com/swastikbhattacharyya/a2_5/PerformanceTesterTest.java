package com.swastikbhattacharyya.a2_5;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;
import org.junit.jupiter.api.Test;

public class PerformanceTesterTest {
  @Test
  void testPerformance() {
    assertTimeout(Duration.ofMillis(100), PerformanceTester::performTask);
  }
}
