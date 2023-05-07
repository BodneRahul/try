package rahul.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rahul.demo.Payload.PostDTO;
import rahul.demo.Service.PostService;


@RestController
@RequestMapping("/api/posts")
public class PostController {

    @Autowired
    private PostService postService;
    @PostMapping("")
    @PreAuthorize("hasRole('ADMIN')")
    ResponseEntity<PostDTO>createPost(@RequestBody PostDTO postDTO){
        PostDTO dto = postService.create(postDTO);
   return  new ResponseEntity<>(dto, HttpStatus.CREATED);
    }
}
