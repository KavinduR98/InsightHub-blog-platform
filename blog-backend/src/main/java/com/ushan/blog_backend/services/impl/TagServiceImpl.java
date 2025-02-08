package com.ushan.blog_backend.services.impl;

import com.ushan.blog_backend.domain.entities.Tag;
import com.ushan.blog_backend.repository.TagRepository;
import com.ushan.blog_backend.services.TagService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TagServiceImpl implements TagService {

    private final TagRepository tagRepository;

    @Override
    public List<Tag> getTags() {
        return tagRepository.findAllWithPostCount();
    }

}
