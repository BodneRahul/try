package rahul.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rahul.demo.Entity.Post;

import java.util.Optional;

public interface PostRepository extends JpaRepository<Post,Long> {



}
