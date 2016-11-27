package org.kambanaria.knots.orm_models;

public class User {

    private final int id;
    private final String name;
    private final int countryId;

    public User(int id, String name, int countryId) {
        this.id = id;
        this.name = name;
        this.countryId = countryId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCountryId() {
        return countryId;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        return (obj instanceof User)
                && (id == ((User) obj).id);
    }

}
