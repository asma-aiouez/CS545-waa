package miu.edu.demo.service;

import miu.edu.demo.domain.User;
import miu.edu.demo.domain.dto.UserDto;
import miu.edu.demo.helper.ListMapper;
import miu.edu.demo.repo.UserRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService{

    @Autowired
    ModelMapper modelMapper;

    @Autowired
    UserRepo userRepo;

    @Autowired
    ListMapper<User,UserDto> listMapperUserToDto;

    @Override
    public List<UserDto> findAll() {
        return (List<UserDto>)listMapperUserToDto.mapList(userRepo.findAll(),new UserDto());
    }

    @Override
    public UserDto findById(long id) {
        return modelMapper.map( userRepo.findById(id) , UserDto.class );
    }

    @Override
    public void save(User p) {
        userRepo.save(p);
    }

    /*@Override
    public List<User> findHaveReviewMoreThan(int n) {
        return userRepo.findHaveReviewMoreThan(n);
    }


    @Override
    public List<User> findByPriceGreaterThan(float price) {

        return userRepo.findByPriceGreaterThan(price);


    }*/


}
