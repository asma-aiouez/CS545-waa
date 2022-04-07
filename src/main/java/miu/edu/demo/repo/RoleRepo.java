package miu.edu.demo.repo;

import miu.edu.demo.domain.Role;
import miu.edu.demo.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepo extends CrudRepository<Role,Long> {
}
