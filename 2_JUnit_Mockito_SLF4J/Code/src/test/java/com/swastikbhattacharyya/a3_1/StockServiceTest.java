package com.swastikbhattacharyya.a3_1;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

class StockServiceTest {

  @Test
  void testGetAveragePriceWithMultipleReturns() {
    StockApiClient mockApiClient = mock(StockApiClient.class);

    when(mockApiClient.getStockPrice("AAPL")).thenReturn(150.0).thenReturn(160.0);

    StockService service = new StockService(mockApiClient);

    double average = service.getAveragePrice("AAPL");

    assertEquals(155.0, average);

    verify(mockApiClient, times(2)).getStockPrice("AAPL");
  }
}
