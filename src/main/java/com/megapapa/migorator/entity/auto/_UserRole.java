package com.megapapa.migorator.entity.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

public abstract class _UserRole extends CayenneDataObject {

    private static final long serialVersionUID = 1L; 

    public static final String ID_PK_COLUMN = "id";

    public static final Property<String> ROLE_NAME = Property.create("roleName", String.class);

    public void setRoleName(String roleName) {
        writeProperty("roleName", roleName);
    }
    public String getRoleName() {
        return (String)readProperty("roleName");
    }

}
