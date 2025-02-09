package com.ushan.blog_backend.services;

import com.ushan.blog_backend.domain.entities.Post;

import java.util.List;
import java.util.UUID;

public interface PostService {
    List<Post> getAllPosts(UUID categoryId, UUID tagId);
}
