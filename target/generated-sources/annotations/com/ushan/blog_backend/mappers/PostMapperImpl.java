package com.ushan.blog_backend.mappers;

import com.ushan.blog_backend.domain.dtos.AuthorDto;
import com.ushan.blog_backend.domain.dtos.CategoryDto;
import com.ushan.blog_backend.domain.dtos.PostDto;
import com.ushan.blog_backend.domain.dtos.TagDto;
import com.ushan.blog_backend.domain.entities.Category;
import com.ushan.blog_backend.domain.entities.Post;
import com.ushan.blog_backend.domain.entities.Tag;
import com.ushan.blog_backend.domain.entities.User;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-09T17:15:00+0530",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.5 (Oracle Corporation)"
)
@Component
public class PostMapperImpl implements PostMapper {

    @Override
    public PostDto toDto(Post post) {
        if ( post == null ) {
            return null;
        }

        PostDto.PostDtoBuilder postDto = PostDto.builder();

        postDto.author( userToAuthorDto( post.getAuthor() ) );
        postDto.category( categoryToCategoryDto( post.getCategory() ) );
        postDto.tags( tagSetToTagDtoSet( post.getTags() ) );
        postDto.id( post.getId() );
        postDto.title( post.getTitle() );
        postDto.content( post.getContent() );
        postDto.readingTime( post.getReadingTime() );
        postDto.createdAt( post.getCreatedAt() );
        postDto.updatedAt( post.getUpdatedAt() );

        return postDto.build();
    }

    protected AuthorDto userToAuthorDto(User user) {
        if ( user == null ) {
            return null;
        }

        AuthorDto.AuthorDtoBuilder authorDto = AuthorDto.builder();

        authorDto.id( user.getId() );
        authorDto.name( user.getName() );

        return authorDto.build();
    }

    protected CategoryDto categoryToCategoryDto(Category category) {
        if ( category == null ) {
            return null;
        }

        CategoryDto.CategoryDtoBuilder categoryDto = CategoryDto.builder();

        categoryDto.id( category.getId() );
        categoryDto.name( category.getName() );

        return categoryDto.build();
    }

    protected TagDto tagToTagDto(Tag tag) {
        if ( tag == null ) {
            return null;
        }

        TagDto.TagDtoBuilder tagDto = TagDto.builder();

        tagDto.id( tag.getId() );
        tagDto.name( tag.getName() );

        return tagDto.build();
    }

    protected Set<TagDto> tagSetToTagDtoSet(Set<Tag> set) {
        if ( set == null ) {
            return null;
        }

        Set<TagDto> set1 = LinkedHashSet.newLinkedHashSet( set.size() );
        for ( Tag tag : set ) {
            set1.add( tagToTagDto( tag ) );
        }

        return set1;
    }
}
