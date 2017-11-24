package com.megapapa.migorator.entity.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import com.megapapa.migorator.entity.Company;
import com.megapapa.migorator.entity.CompanyInvite;
import com.megapapa.migorator.entity.Databases;

public abstract class _User extends CayenneDataObject {

    private static final long serialVersionUID = 1L; 

    public static final String ID_PK_COLUMN = "id";

    public static final Property<String> EMAIL = Property.create("email", String.class);
    public static final Property<String> PASSWORD = Property.create("password", String.class);
    public static final Property<String> USERNAME = Property.create("username", String.class);
    public static final Property<List<Company>> COMPANIES = Property.create("companies", List.class);
    public static final Property<List<CompanyInvite>> COMPANY_INVITES = Property.create("companyInvites", List.class);
    public static final Property<List<Databases>> DATABASESES = Property.create("databaseses", List.class);

    public void setEmail(String email) {
        writeProperty("email", email);
    }
    public String getEmail() {
        return (String)readProperty("email");
    }

    public void setPassword(String password) {
        writeProperty("password", password);
    }
    public String getPassword() {
        return (String)readProperty("password");
    }

    public void setUsername(String username) {
        writeProperty("username", username);
    }
    public String getUsername() {
        return (String)readProperty("username");
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


    public void addToCompanyInvites(CompanyInvite obj) {
        addToManyTarget("companyInvites", obj, true);
    }
    public void removeFromCompanyInvites(CompanyInvite obj) {
        removeToManyTarget("companyInvites", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<CompanyInvite> getCompanyInvites() {
        return (List<CompanyInvite>)readProperty("companyInvites");
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


}
