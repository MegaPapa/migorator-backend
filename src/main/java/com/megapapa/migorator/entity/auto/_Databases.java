package com.megapapa.migorator.entity.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.megapapa.migorator.entity.Comment;
import com.megapapa.migorator.entity.Company;
import com.megapapa.migorator.entity.DatabaseDump;
import com.megapapa.migorator.entity.DatabaseStamp;
import com.megapapa.migorator.entity.User;

public abstract class _Databases extends CayenneDataObject {

    private static final long serialVersionUID = 1L; 

    public static final String ID_PK_COLUMN = "id";

    public static final Property<String> DATABASE_NAME = Property.create("databaseName", String.class);
    public static final Property<String> DATABASE_TYPE = Property.create("databaseType", String.class);
    public static final Property<List<Comment>> COMMENTS = Property.create("comments", List.class);
    public static final Property<List<Company>> COMPANIES = Property.create("companies", List.class);
    public static final Property<List<DatabaseDump>> DATABASE_DUMPS = Property.create("databaseDumps", List.class);
    public static final Property<List<DatabaseStamp>> DATABASE_STAMPS = Property.create("databaseStamps", List.class);
    public static final Property<User> USERS = Property.create("users", User.class);

    public void setDatabaseName(String databaseName) {
        writeProperty("databaseName", databaseName);
    }
    public String getDatabaseName() {
        return (String)readProperty("databaseName");
    }

    public void setDatabaseType(String databaseType) {
        writeProperty("databaseType", databaseType);
    }
    public String getDatabaseType() {
        return (String)readProperty("databaseType");
    }

    public void addToComments(Comment obj) {
        addToManyTarget("comments", obj, true);
    }
    public void removeFromComments(Comment obj) {
        removeToManyTarget("comments", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Comment> getComments() {
        return (List<Comment>)readProperty("comments");
    }


    public void addToCompanies(Company obj) {
        addToManyTarget("companies", obj, true);
    }
    public void removeFromCompanies(Company obj) {
        removeToManyTarget("companies", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Company> getCompanies() {
        return (List<Company>)readProperty("companies");
    }


    public void addToDatabaseDumps(DatabaseDump obj) {
        addToManyTarget("databaseDumps", obj, true);
    }
    public void removeFromDatabaseDumps(DatabaseDump obj) {
        removeToManyTarget("databaseDumps", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<DatabaseDump> getDatabaseDumps() {
        return (List<DatabaseDump>)readProperty("databaseDumps");
    }


    public void addToDatabaseStamps(DatabaseStamp obj) {
        addToManyTarget("databaseStamps", obj, true);
    }
    public void removeFromDatabaseStamps(DatabaseStamp obj) {
        removeToManyTarget("databaseStamps", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<DatabaseStamp> getDatabaseStamps() {
        return (List<DatabaseStamp>)readProperty("databaseStamps");
    }


    public void setUsers(User users) {
        setToOneTarget("users", users, true);
    }

    public User getUsers() {
        return (User)readProperty("users");
    }


}
