package blog_platform.blogplatform;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/posts")
public class PostController {
    @Autowired
    private PostService postService;

    @PostMapping
    public Post addPost(@RequestBody Post post) {
        return postService.createPost(post);
    }
    @GetMapping
    public List<Post> getAllPosts() {
        System.out.println("Did we get all the posts");
        return postService.findAll();
    }
    @PutMapping("/{id}")
    public Post updatePost(@PathVariable Long id, @RequestBody Post post) {
        return postService.update(post, id);
    }
    @DeleteMapping("/{id}")
    public String deletePost(@PathVariable Long id) {
        return postService.deleteById(id);
    }
    @GetMapping("{id}")
    public Post getPostById(@PathVariable Long id) {
        return postService.findById(id);
    }
}
