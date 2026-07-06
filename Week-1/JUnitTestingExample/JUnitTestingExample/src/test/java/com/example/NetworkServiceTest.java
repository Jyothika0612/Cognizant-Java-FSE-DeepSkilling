package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

public class NetworkServiceTest {

    @Test
    public void testServiceWithMockNetworkClient() {

        // Arrange
        NetworkClient mockNetworkClient = mock(NetworkClient.class);

        when(mockNetworkClient.connect())
                .thenReturn("Mock Connection");

        NetworkService networkService =
                new NetworkService(mockNetworkClient);

        // Act
        String result = networkService.connectToServer();

        // Assert
        assertEquals("Connected to Mock Connection", result);

        // Verify Interaction
        verify(mockNetworkClient).connect();
    }
}