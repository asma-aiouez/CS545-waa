package miu.edu.demo.service;


import miu.edu.demo.domain.User;
import miu.edu.demo.domain.dto.ProductDto;

import java.util.List;

public interface ProductService {

    List<ProductDto> findAll();

    ProductDto findById(int id);

    void save(User p);

    List<User> findHaveReviewMoreThan(int n);

    List<User> findByPriceGreaterThan(float price);
}
