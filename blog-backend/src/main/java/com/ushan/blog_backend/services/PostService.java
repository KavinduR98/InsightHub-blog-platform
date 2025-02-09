package com.ushan.blog_backend.services;

import com.ushan.blog_backend.domain.CreatePostRequest;
import com.ushan.blog_backend.domain.entities.Post;
import com.ushan.blog_backend.domain.entities.User;

import java.util.List;
import java.util.UUID;

public interface PostService {
    List<Post> getAllPosts(UUID categoryId, UUID tagId);
    List<Post> getDraftPosts(User user);
    Post createPost(User user, CreatePostRequest createPostRequest);
}
