package org.learn.rest.service;

import org.learn.rest.dto.UserDto;

import java.util.List;
import java.util.Optional;

public interface UserService {
    //Optional<UserDto> getUserById(int id);
    Optional<UserDto> getUserById(int id);
    Optional<List<UserDto>> getUsers();
    UserDto updateUser(UserDto userDto);
    UserDto createUser(UserDto userDto);
    void deleteUserById(int id);
}
