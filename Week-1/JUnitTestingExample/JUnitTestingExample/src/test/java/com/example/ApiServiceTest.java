package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

public class ApiServiceTest {

    @Test
    public void testServiceWithMockRestClient() {

        // Create Mock REST Client
        RestClient mockRestClient = mock(RestClient.class);

        // Stub Response
        when(mockRestClient.getResponse())
                .thenReturn("Mock Response");

        // Create Service
        ApiService apiService =
                new ApiService(mockRestClient);

        // Call Method
        String result = apiService.fetchData();

        // Verify Output
        assertEquals("Fetched Mock Response", result);
    }
} 