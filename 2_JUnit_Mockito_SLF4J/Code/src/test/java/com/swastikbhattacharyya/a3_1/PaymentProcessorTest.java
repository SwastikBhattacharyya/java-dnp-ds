package com.swastikbhattacharyya.a3_1;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

class PaymentProcessorTest {

  @Test
  void testProcessPaymentCalledWithSpecificArguments() {
    PaymentProcessor mockProcessor = mock(PaymentProcessor.class);

    mockProcessor.processPayment("user123", 250.0);

    verify(mockProcessor).processPayment(eq("user123"), eq(250.0));
  }
}
