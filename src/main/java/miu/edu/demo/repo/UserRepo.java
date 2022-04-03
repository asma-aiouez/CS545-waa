package miu.edu.demo.repo;


import miu.edu.demo.domain.Post;
import miu.edu.demo.domain.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepo extends CrudRepository<User,Long> {

    List<User> findAll();
    User findById(long id);
}
