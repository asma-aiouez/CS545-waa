package miu.edu.demo.controller;


import miu.edu.demo.domain.User;
import miu.edu.demo.domain.dto.UserDto;
import miu.edu.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    @Autowired
    UserService userService;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping
    public List<UserDto> getUser(){
        return userService.findAll();
    }

//    @GetMapping("/{id}")
//    public ResponseEntity<ProductDto> getProductById(@PathVariable("id") int id){
//        HttpHeaders headers = new HttpHeaders();
//        headers.add("Custom-Header","someValue");
//       return ResponseEntity.ok().headers(headers).body(productService.findById(id));
//    }

    @GetMapping("/{id}")
    public UserDto getUser(@PathVariable("id") int id){
        return userService.findById(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public void saveUser( @RequestBody User p ){
        userService.save(p);
    }


   /* @GetMapping("/filter/review/{val}")
    public List<User> findProductsReviewMoreThan(@PathVariable("val") int val){
        return userService.findHaveReviewMoreThan(val);
    }

    @GetMapping("/filter/price/{val}")
    public List<User> findByPrice(@PathVariable("val") float val){
        return productService.findByPriceGreaterThan(val);
    }*/




}
