package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

public class NotificationServiceTest {

    @Test
    public void testArgumentMatching() {

        // Create Mock
        MessageService mockService = mock(MessageService.class);

        // Stub Method
        when(mockService.sendMessage(anyString()))
                .thenReturn("Message Sent");

        // Create Service
        NotificationService service =
                new NotificationService(mockService);

        // Call Method
        String result = service.notifyUser("Hello");

        // Verify Result
        assertEquals("Message Sent", result);

        // Verify Interaction
        verify(mockService).sendMessage(anyString());
    }
}