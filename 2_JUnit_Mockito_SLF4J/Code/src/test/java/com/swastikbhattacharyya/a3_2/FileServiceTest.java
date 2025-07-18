package com.swastikbhattacharyya.a3_2;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

class FileServiceTest {

  @Test
  void testProcessFile() {
    MyFileReader mockReader = mock(MyFileReader.class);
    MyFileWriter mockWriter = mock(MyFileWriter.class);

    when(mockReader.readFile("input.txt")).thenReturn("hello world");

    FileService service = new FileService(mockReader, mockWriter);

    service.processFile("input.txt", "output.txt");

    verify(mockReader).readFile("input.txt");

    verify(mockWriter).writeFile("output.txt", "HELLO WORLD");
  }
}
