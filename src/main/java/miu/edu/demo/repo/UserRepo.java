package miu.edu.demo.repo;


import miu.edu.demo.domain.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepo extends CrudRepository<User,Integer> {

    List<User> findAll();

    List<User> findByPriceGreaterThan(float price);

    User findById(int id);

    @Query("select p from User p where p.review.size >= :n")
    List<User> findHaveReviewMoreThan(int n);




}
