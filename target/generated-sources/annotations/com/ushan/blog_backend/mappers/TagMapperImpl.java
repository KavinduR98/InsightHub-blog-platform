package com.ushan.blog_backend.mappers;

import com.ushan.blog_backend.domain.dtos.TagResponse;
import com.ushan.blog_backend.domain.entities.Tag;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-08T22:46:56+0530",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.5 (Oracle Corporation)"
)
@Component
public class TagMapperImpl implements TagMapper {

    @Override
    public TagResponse toTagResponse(Tag tag) {
        if ( tag == null ) {
            return null;
        }

        TagResponse.TagResponseBuilder tagResponse = TagResponse.builder();

        tagResponse.postCount( calculatePostCount( tag.getPosts() ) );
        tagResponse.id( tag.getId() );
        tagResponse.name( tag.getName() );

        return tagResponse.build();
    }
}
