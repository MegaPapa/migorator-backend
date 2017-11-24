package com.megapapa.migorator.entity.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.megapapa.migorator.entity.Company;
import com.megapapa.migorator.entity.User;

public abstract class _CompanyInvite extends CayenneDataObject {

    private static final long serialVersionUID = 1L; 

    public static final String COMPANY_ID_PK_COLUMN = "company_id";
    public static final String USERS_ID_PK_COLUMN = "users_id";

    public static final Property<Boolean> IS_ACCEPTED = Property.create("isAccepted", Boolean.class);
    public static final Property<Company> COMPANY = Property.create("company", Company.class);
    public static final Property<User> USERS = Property.create("users", User.class);

    public void setIsAccepted(boolean isAccepted) {
        writeProperty("isAccepted", isAccepted);
    }
	public boolean isIsAccepted() {
        Boolean value = (Boolean)readProperty("isAccepted");
        return (value != null) ? value.booleanValue() : false;
    }

    public void setCompany(Company company) {
        setToOneTarget("company", company, true);
    }

    public Company getCompany() {
        return (Company)readProperty("company");
    }


    public void setUsers(User users) {
        setToOneTarget("users", users, true);
    }

    public User getUsers() {
        return (User)readProperty("users");
    }


}
