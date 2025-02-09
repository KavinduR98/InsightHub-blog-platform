package com.ushan.blog_backend.mappers;

import com.ushan.blog_backend.domain.CreatePostRequest;
import com.ushan.blog_backend.domain.dtos.CreatePostRequestDto;
import com.ushan.blog_backend.domain.dtos.PostDto;
import com.ushan.blog_backend.domain.entities.Post;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PostMapper {

    @Mapping(target = "author", source = "author")
    @Mapping(target = "category", source = "category")
    @Mapping(target = "tags", source = "tags")
    PostDto toDto(Post post);

    CreatePostRequest toCreatePostRequest(CreatePostRequestDto dto);
}
