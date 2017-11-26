package com.megapapa.migorator.service;

import com.megapapa.migorator.dto.UserDTO;
import com.megapapa.migorator.entity.User;

public interface UserService {

    void registerNewUser(UserDTO userDTO);
    UserDTO getUser(int id);
    UserDTO getUser(String email);
    void updateUserInfo(UserDTO userDTO, int id);
    void deleteUser(int id);
}
