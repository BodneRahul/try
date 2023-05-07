package rahul.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rahul.demo.Entity.Post;
import rahul.demo.Payload.PostDTO;
import rahul.demo.Repository.PostRepository;


@Service
public class PostService {
        @Autowired
        private PostRepository postRepository;
    public PostDTO create(PostDTO postDTO) {
        Post post = mapToEntity(postDTO);
        Post save = postRepository.save(post);
        return mapToDTO(save);
    }
        Post mapToEntity(PostDTO postDTO){
        Post post = new Post();
        post.setId(post.getId());
        post.setTitle(postDTO.getTitle());
        post.setContent(postDTO.getContent());
        return  post;
          }

       PostDTO mapToDTO(Post post){
        PostDTO postDTO= new PostDTO();
        postDTO.setContent(post.getContent());
        postDTO.setId(post.getId());
        postDTO.setTitle(post.getTitle());
        return postDTO;
       }


}
