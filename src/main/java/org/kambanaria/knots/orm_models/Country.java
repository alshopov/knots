package org.kambanaria.knots.orm_models;

public class Country {

    private final int id;
    private final String name;
    private final int currencyId;

    public Country(int id, String name, int currencyId) {
        this.id = id;
        this.name = name;
        this.currencyId = currencyId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCurrencyId() {
        return currencyId;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        return (obj instanceof Country)
                && (id == ((Country) obj).id);
    }

}
