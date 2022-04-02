package miu.edu.demo.repo;

import miu.edu.demo.domain.Post;
import org.springframework.data.repository.CrudRepository;

public interface ReviewRepo extends CrudRepository<Post,Integer> {
}
