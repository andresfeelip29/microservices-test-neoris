package com.co.neoristest.users.service;

import com.co.neoristest.users.domain.dto.UserDto;
import com.co.neoristest.users.domain.dto.UserResponseDto;

import java.util.List;
import java.util.Optional;

public interface UserService {

    List<UserResponseDto> getAllUsers();

    Optional<UserResponseDto> findUserById(Long id);

    Optional<UserResponseDto> findUserAccountDetail(Long id);

    Optional<UserResponseDto> findUserByUsername(String username);

    UserResponseDto save(UserDto userDto);

    UserResponseDto update(UserDto userDto, Long id);

    void delete (Long id);

}
