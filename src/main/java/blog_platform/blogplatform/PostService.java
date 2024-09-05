package blog_platform.blogplatform;

import org.springframework.stereotype.Service;

import java.util.List;

public interface PostService {
    public Post createPost(Post post);
    public List<Post> findAll();
    public Post findById(Long id);
    public String deleteById(Long id);
    public Post update(Post post, Long id);
}
