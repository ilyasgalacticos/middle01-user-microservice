package kz.bitlab.middle01userservice.mapper;


import kz.bitlab.middle01userservice.dto.UserDTO;
import kz.bitlab.middle01userservice.model.User;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDTO toDto(User user);
    User toEntity(UserDTO userDTO);
    List<UserDTO> toDtoList(List<User> users);
}
