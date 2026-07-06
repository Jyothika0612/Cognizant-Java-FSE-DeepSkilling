package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

public class DataServiceTest {

    @Test
    public void testMultipleReturns() {

        // Create Mock Object
        DataProvider mockProvider = mock(DataProvider.class);

        // Stub Multiple Return Values
        when(mockProvider.getData())
                .thenReturn("First Data")
                .thenReturn("Second Data");

        // Create Service
        DataService service = new DataService(mockProvider);

        // First Call
        String first = service.fetchData();

        // Second Call
        String second = service.fetchData();

        // Verify Results
        assertEquals("First Data", first);
        assertEquals("Second Data", second);
    }
}