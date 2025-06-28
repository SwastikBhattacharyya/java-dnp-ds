package com.swastikbhattacharyya.a3_1;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

class LoggerTest {
  @Test
  void testLogMethodCalled() {
    Logger mockLogger = mock(Logger.class);

    mockLogger.log("Mockito");
    verify(mockLogger).log("Mockito");
  }
}
