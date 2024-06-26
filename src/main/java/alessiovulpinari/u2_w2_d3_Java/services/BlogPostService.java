package alessiovulpinari.u2_w2_d3_Java.services;

import alessiovulpinari.u2_w2_d3_Java.entities.BlogPost;
import alessiovulpinari.u2_w2_d3_Java.exceptions.NotFoundException;
import alessiovulpinari.u2_w2_d3_Java.repositories.BlogPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BlogPostService {

    @Autowired
    private BlogPostRepository blogPostRepository;

    public Page<BlogPost> getBlogPost(int pageNumber, int pageSize) {
        Pageable pageable = PageRequest.of(pageNumber, pageSize);
        return blogPostRepository.findAll(pageable);
    }

    // save

    public BlogPost findById(UUID blogPostId) {
        return blogPostRepository.findById(blogPostId).orElseThrow(() -> new NotFoundException(blogPostId));
    }

    // findByIdAndSave

    public void findByIdAndDelete(UUID blogPostId) {
        BlogPost blogPost = findById(blogPostId);
        this.blogPostRepository.delete(blogPost);
    }

}
