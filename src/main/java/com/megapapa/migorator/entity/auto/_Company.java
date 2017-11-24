package com.megapapa.migorator.entity.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.megapapa.migorator.entity.Databases;
import com.megapapa.migorator.entity.User;

public abstract class _Company extends CayenneDataObject {

    private static final long serialVersionUID = 1L; 

    public static final String ID_PK_COLUMN = "id";

    public static final Property<String> NAME = Property.create("name", String.class);
    public static final Property<List<Databases>> DATABASESES = Property.create("databaseses", List.class);
    public static final Property<User> USER = Property.create("user", User.class);

    public void setName(String name) {
        writeProperty("name", name);
    }
    public String getName() {
        return (String)readProperty("name");
    }

    public void addToDatabaseses(Databases obj) {
        addToManyTarget("databaseses", obj, true);
    }
    public void removeFromDatabaseses(Databases obj) {
        removeToManyTarget("databaseses", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Databases> getDatabaseses() {
        return (List<Databases>)readProperty("databaseses");
    }


    public void setUser(User user) {
        setToOneTarget("user", user, true);
    }

    public User getUser() {
        return (User)readProperty("user");
    }


}
