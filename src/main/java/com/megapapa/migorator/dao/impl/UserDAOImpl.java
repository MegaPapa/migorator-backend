package com.megapapa.migorator.dao.impl;

import com.megapapa.migorator.dao.UserDAO;
import com.megapapa.migorator.entity.User;
import org.apache.cayenne.ObjectContext;
import org.apache.cayenne.configuration.server.ServerRuntime;
import org.apache.cayenne.query.ObjectSelect;
import org.apache.cayenne.query.SelectById;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.encoding.ShaPasswordEncoder;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAOImpl implements UserDAO {

    private final ServerRuntime runtime;
    private final ShaPasswordEncoder shaPasswordEncoder;

    @Autowired
    public UserDAOImpl(ServerRuntime runtime, ShaPasswordEncoder shaPasswordEncoder) {
        this.runtime = runtime;
        this.shaPasswordEncoder = shaPasswordEncoder;
    }

    @Override
    public void addNewUser(User user) {
        ObjectContext context = runtime.newContext();
        User addedUser = context.newObject(User.class);
        addedUser.setUsername(user.getUsername());
        addedUser.setEmail(user.getEmail());
        addedUser.setPassword(shaPasswordEncoder.encodePassword(user.getPassword(), ""));
        context.commitChanges();
    }

    @Override
    public User getUserById(int id) {
        ObjectContext context = runtime.newContext();
        return SelectById.query(User.class, id).selectFirst(context);
    }

    @Override
    public User getUserByEmail(String email) {
        ObjectContext context = runtime.newContext();
        return ObjectSelect.query(User.class).where(User.EMAIL.eq(email)).selectOne(context);
    }

    @Override
    public void updateUserInfo(int id, User user) {
        ObjectContext context = runtime.newContext();
        User oldUser = SelectById.query(User.class, id).selectOne(context);
        if (oldUser != null) {
            oldUser.setUsername(user.getUsername());
            oldUser.setEmail(user.getEmail());
            oldUser.setPassword(user.getPassword());
        }
        context.commitChanges();
    }

    @Override
    public void deleteUserById(int id) {
        ObjectContext context = runtime.newContext();
        User user = SelectById.query(User.class, id).selectOne(context);
        context.deleteObject(user);
        context.commitChanges();
    }
}
