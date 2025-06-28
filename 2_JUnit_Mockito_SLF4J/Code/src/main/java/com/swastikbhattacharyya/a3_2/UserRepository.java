package com.swastikbhattacharyya.a3_2;

public interface UserRepository {
  User findByUsername(String username);
}
