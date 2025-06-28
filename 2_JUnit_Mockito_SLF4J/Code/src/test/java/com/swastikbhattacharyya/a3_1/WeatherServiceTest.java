package com.swastikbhattacharyya.a3_1;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

class WeatherServiceTest {
  @Test
  void testGetWeatherReport() {
    WeatherApiClient mockApiClient = mock(WeatherApiClient.class);

    when(mockApiClient.getCurrentWeather("London")).thenReturn("Sunny");

    WeatherService service = new WeatherService(mockApiClient);

    String report = service.getWeatherReport("London");

    assertEquals("Weather in London is Sunny", report);

    verify(mockApiClient).getCurrentWeather("London");
  }
}
