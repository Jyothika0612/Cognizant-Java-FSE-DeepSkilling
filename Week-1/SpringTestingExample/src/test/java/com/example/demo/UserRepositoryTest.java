package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class UserRepositoryTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserService userService;

    @BeforeEach
    void setUp() {

        MockitoAnnotations.openMocks(this);

    }

    @Test
    void testFindByName() {

        // Arrange
        List<User> users = Arrays.asList(
                new User(1L, "Jyothika"));

        when(userRepository.findByName("Jyothika"))
                .thenReturn(users);

        // Act
        List<User> result =
                userService.getUsersByName("Jyothika");

        // Assert
        assertEquals(1, result.size());
        assertEquals("Jyothika",
                result.get(0).getName());

    }
}