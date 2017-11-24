package com.megapapa.migorator.entity.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.megapapa.migorator.entity.Comment;
import com.megapapa.migorator.entity.Databases;

public abstract class _DatabaseDump extends CayenneDataObject {

    private static final long serialVersionUID = 1L; 

    public static final String ID_PK_COLUMN = "id";

    public static final Property<String> DUMP_NAME = Property.create("dumpName", String.class);
    public static final Property<List<Comment>> COMMENTS = Property.create("comments", List.class);
    public static final Property<Databases> DATABASES = Property.create("databases", Databases.class);

    public void setDumpName(String dumpName) {
        writeProperty("dumpName", dumpName);
    }
    public String getDumpName() {
        return (String)readProperty("dumpName");
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


    public void setDatabases(Databases databases) {
        setToOneTarget("databases", databases, true);
    }

    public Databases getDatabases() {
        return (Databases)readProperty("databases");
    }


}
