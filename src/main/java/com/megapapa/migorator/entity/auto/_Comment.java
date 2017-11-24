package com.megapapa.migorator.entity.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.megapapa.migorator.entity.DatabaseDump;
import com.megapapa.migorator.entity.Databases;

public abstract class _Comment extends CayenneDataObject {

    private static final long serialVersionUID = 1L; 

    public static final String ID_PK_COLUMN = "id";

    public static final Property<String> TEXT = Property.create("text", String.class);
    public static final Property<DatabaseDump> DATABASE_DUMP = Property.create("databaseDump", DatabaseDump.class);
    public static final Property<Databases> DATABASES = Property.create("databases", Databases.class);

    public void setText(String text) {
        writeProperty("text", text);
    }
    public String getText() {
        return (String)readProperty("text");
    }

    public void setDatabaseDump(DatabaseDump databaseDump) {
        setToOneTarget("databaseDump", databaseDump, true);
    }

    public DatabaseDump getDatabaseDump() {
        return (DatabaseDump)readProperty("databaseDump");
    }


    public void setDatabases(Databases databases) {
        setToOneTarget("databases", databases, true);
    }

    public Databases getDatabases() {
        return (Databases)readProperty("databases");
    }


}
