package com.megapapa.migorator.service.impl;

import com.megapapa.migorator.dao.UserDAO;
import com.megapapa.migorator.dto.UserDTO;
import com.megapapa.migorator.entity.User;
import com.megapapa.migorator.service.UserService;
import com.megapapa.migorator.util.transfer.UserTransferer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserDAO userDAO;

    @Autowired
    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public void registerNewUser(UserDTO userDTO) {
        User user = UserTransferer.fromDTO(userDTO);
        userDAO.addNewUser(user);
    }

    @Override
    public UserDTO getUser(int id) {
        User user = userDAO.getUserById(id);
        UserDTO userDTO = UserTransferer.toDTO(user);
        return userDTO;
    }

    @Override
    public void updateUserInfo(UserDTO userDTO, int id) {
        userDAO.updateUserInfo(id, UserTransferer.fromDTO(userDTO));
    }

    @Override
    public void deleteUser(int id) {
        userDAO.deleteUserById(id);
    }
}
