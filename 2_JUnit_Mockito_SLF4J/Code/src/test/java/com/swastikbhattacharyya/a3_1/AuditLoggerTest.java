package com.swastikbhattacharyya.a3_1;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.mockito.InOrder;

class AuditLoggerTest {

  @Test
  void testMethodCallOrder() {
    AuditLogger mockLogger = mock(AuditLogger.class);

    mockLogger.logStart("DataLoad");
    mockLogger.logEnd("DataLoad");

    InOrder inOrder = inOrder(mockLogger);
    inOrder.verify(mockLogger).logStart("DataLoad");
    inOrder.verify(mockLogger).logEnd("DataLoad");
  }
}
