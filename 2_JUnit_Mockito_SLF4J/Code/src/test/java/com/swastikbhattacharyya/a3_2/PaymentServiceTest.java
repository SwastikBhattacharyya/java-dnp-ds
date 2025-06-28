package com.swastikbhattacharyya.a3_2;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

class PaymentServiceTest {

  @Test
  void testProcessPayment() {
    NetworkClient mockClient = mock(NetworkClient.class);

    when(mockClient.postData("https://api.payments.com/pay", "{\"amount\":100.0}"))
        .thenReturn("SUCCESS");

    PaymentService service = new PaymentService(mockClient);

    String status = service.processPayment(100.0);

    assertEquals("Payment status: SUCCESS", status);

    verify(mockClient).postData("https://api.payments.com/pay", "{\"amount\":100.0}");
  }
}
