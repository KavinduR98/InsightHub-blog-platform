package com.ushan.blog_backend.services;

import com.ushan.blog_backend.domain.entities.Tag;

import java.util.List;

public interface TagService {
    List<Tag> getTags();
}
