package com.megapapa.migorator.util.transfer;

import com.megapapa.migorator.dto.UserDTO;
import com.megapapa.migorator.entity.User;

public class UserTransferer {

    public static UserDTO toDTO(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setEmail(user.getEmail());
        userDTO.setId(1); // TODO: GET ID FROM OBJECT!!!
        userDTO.setUserName(user.getUsername());
        return userDTO;
    }

    public static User fromDTO(UserDTO userDTO) {
        User user = new User();
        user.setEmail(userDTO.getEmail());
        user.setPassword(userDTO.getPassword());
        user.setUsername(userDTO.getUserName());
        return user;
    }
}
