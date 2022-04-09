package miu.edu.demo.domain.dto;

import lombok.Data;
import miu.edu.demo.domain.Role;

import java.util.List;

@Data
public class UserDto {

    private long id;
    private String name;
    private List<Role> roles;
}
