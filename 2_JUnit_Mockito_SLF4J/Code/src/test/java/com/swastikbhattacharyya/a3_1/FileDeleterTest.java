package com.swastikbhattacharyya.a3_1;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

class FileDeleterTest {

  @Test
  void testDeleteFileThrowsException() {
    FileDeleter mockDeleter = mock(FileDeleter.class);

    doThrow(new RuntimeException("File not found")).when(mockDeleter).deleteFile("important.txt");

    RuntimeException thrown =
        assertThrows(RuntimeException.class, () -> mockDeleter.deleteFile("important.txt"));
    assertEquals("File not found", thrown.getMessage());

    verify(mockDeleter).deleteFile("important.txt");
  }
}
