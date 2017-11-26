package com.megapapa.migorator.dao;

import com.megapapa.migorator.entity.User;


public interface UserDAO {

    void addNewUser(User user);
    User getUserById(int id);
    User getUserByEmail(String email);
    void updateUserInfo(int id, User user);
    void deleteUserById(int id);
}
