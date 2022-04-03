package miu.edu.demo.repo;

import miu.edu.demo.domain.Post;
import miu.edu.demo.domain.User;
import miu.edu.demo.domain.dto.PostDto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PostRepo extends CrudRepository<Post,Integer> {

    Post findById(long id);

    List<Post> findAll();

   // @Query(value = "SELECT * FROM POST WHERE user_post_id= :idUser", nativeQuery = true)
    //List<Post> getPost(long idUser);

    List<Post> findAllByUser(User user);
    List<Post> findAllByTitle(String title);
}
