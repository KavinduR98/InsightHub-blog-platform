package com.ushan.blog_backend.services;

import com.ushan.blog_backend.domain.entities.User;

import java.util.UUID;

public interface UserService {
    User getUserById(UUID id);
}
