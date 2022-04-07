package miu.edu.demo;

import miu.edu.demo.domain.Role;
import miu.edu.demo.domain.User;
import miu.edu.demo.repo.RoleRepo;
import miu.edu.demo.repo.UserRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	UserRepo userRepo;
	@Autowired
	RoleRepo roleRepo;
	@Autowired
	PasswordEncoder passwordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


	@Bean
	public ModelMapper modelMapper(){
		return new ModelMapper();
	}


	@Override
	public void run(String... args) throws Exception {

		Role role1 = new Role(1, "ROLE_ADMIN");
		Role role2 = new Role(2, "ROLE_USER");

		roleRepo.save(role1);roleRepo.save(role2);

		List<Role> rolesList = new ArrayList<>();
		rolesList.add(role1);

		User userData = new User(1, "asma@miu.edu", passwordEncoder.encode("123"), rolesList, null, null );
		userRepo.save(userData);
	}
}
