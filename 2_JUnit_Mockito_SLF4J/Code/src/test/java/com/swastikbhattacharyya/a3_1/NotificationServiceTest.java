package com.swastikbhattacharyya.a3_1;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

class NotificationServiceTest {

  @Test
  void testSendEmailCalledWithSpecificArguments() {
    NotificationService mockService = mock(NotificationService.class);

    mockService.sendEmail("john@example.com", "Hello John!");

    verify(mockService).sendEmail("john@example.com", "Hello John!");
  }
}
