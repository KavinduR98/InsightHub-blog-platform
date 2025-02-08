package com.ushan.blog_backend.services;

import com.ushan.blog_backend.domain.entities.Tag;

import java.util.List;
import java.util.Set;
import java.util.UUID;

public interface TagService {
    List<Tag> getTags();
    List<Tag> createTags(Set<String> tagNames);
    Void deleteTag(UUID id);
}
