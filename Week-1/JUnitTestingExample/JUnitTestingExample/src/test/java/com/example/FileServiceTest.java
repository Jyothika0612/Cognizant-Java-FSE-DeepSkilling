package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

public class FileServiceTest {

    @Test
    public void testServiceWithMockFileIO() {

        // Arrange
        FileReader mockFileReader = mock(FileReader.class);
        FileWriter mockFileWriter = mock(FileWriter.class);

        when(mockFileReader.read())
                .thenReturn("Mock File Content");

        FileService fileService =
                new FileService(mockFileReader, mockFileWriter);

        // Act
        String result = fileService.processFile();

        // Assert
        assertEquals("Processed Mock File Content", result);

        verify(mockFileWriter).write("Mock File Content");
    }
}