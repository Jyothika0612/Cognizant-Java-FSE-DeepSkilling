package com.example;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

public class UserServiceTest {

    @Test
    public void testVoidMethod() {

        // Create Mock
        Logger mockLogger = mock(Logger.class);

        // Stub Void Method
        doNothing().when(mockLogger).log("User Saved");

        // Create Service
        UserService service = new UserService(mockLogger);

        // Call Method
        service.saveUser();

        // Verify Interaction
        verify(mockLogger).log("User Saved");
    }
}