package com.swastikbhattacharyya.a3_2;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

class UserServiceTest {

  @Test
  void testGetUserEmailReturnsCorrectEmail() {
    UserRepository mockRepo = mock(UserRepository.class);

    User user = new User("john", "john@example.com");

    doReturn(user).when(mockRepo).findByUsername("john");

    UserService userService = new UserService(mockRepo);

    String email = userService.getUserEmail("john");

    assertEquals("john@example.com", email);

    verify(mockRepo).findByUsername("john");
  }
}
