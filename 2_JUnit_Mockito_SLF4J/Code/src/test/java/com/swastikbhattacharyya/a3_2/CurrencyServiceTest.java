package com.swastikbhattacharyya.a3_2;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

class CurrencyServiceTest {

  @Test
  void testConvert() {
    CurrencyApiClient mockApiClient = mock(CurrencyApiClient.class);

    when(mockApiClient.getExchangeRate("USD", "INR")).thenReturn(82.5);

    CurrencyService service = new CurrencyService(mockApiClient);

    double converted = service.convert("USD", "INR", 10);

    assertEquals(825.0, converted);

    verify(mockApiClient).getExchangeRate("USD", "INR");
  }
}
