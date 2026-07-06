package com.example;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

public class MyServiceVerifyTest {

    @Test
    public void testVerifyInteraction() {

        // Create Mock Object
        ExternalApi mockApi = mock(ExternalApi.class);

        // Create Service
        MyService service = new MyService(mockApi);

        // Call the Method
        service.fetchData();

        // Verify that getData() was called
        verify(mockApi).getData();
    }
}