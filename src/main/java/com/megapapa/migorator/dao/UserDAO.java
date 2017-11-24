package com.megapapa.migorator.dao;

import com.megapapa.migorator.entity.User;


public interface UserDAO {

    void addNewUser(User user);
    User getUserById(int id);
    void updateUserInfo(int id, User user);
    void deleteUserById(int id);
}
