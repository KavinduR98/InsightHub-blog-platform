package com.ushan.blog_backend.mappers;

import com.ushan.blog_backend.domain.dtos.TagDto;
import com.ushan.blog_backend.domain.entities.Tag;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-09T17:14:59+0530",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.5 (Oracle Corporation)"
)
@Component
public class TagMapperImpl implements TagMapper {

    @Override
    public TagDto toTagResponse(Tag tag) {
        if ( tag == null ) {
            return null;
        }

        TagDto.TagDtoBuilder tagDto = TagDto.builder();

        tagDto.postCount( calculatePostCount( tag.getPosts() ) );
        tagDto.id( tag.getId() );
        tagDto.name( tag.getName() );

        return tagDto.build();
    }
}
