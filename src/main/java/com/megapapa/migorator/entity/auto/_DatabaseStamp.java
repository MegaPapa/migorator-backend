package com.megapapa.migorator.entity.auto;

import java.time.LocalDate;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.megapapa.migorator.entity.Databases;

public abstract class _DatabaseStamp extends CayenneDataObject {

    private static final long serialVersionUID = 1L; 

    public static final String ID_PK_COLUMN = "id";

    public static final Property<LocalDate> TIMESTAMP = Property.create("timestamp", LocalDate.class);
    public static final Property<Databases> DATABASES = Property.create("databases", Databases.class);

    public void setTimestamp(LocalDate timestamp) {
        writeProperty("timestamp", timestamp);
    }
    public LocalDate getTimestamp() {
        return (LocalDate)readProperty("timestamp");
    }

    public void setDatabases(Databases databases) {
        setToOneTarget("databases", databases, true);
    }

    public Databases getDatabases() {
        return (Databases)readProperty("databases");
    }


}
