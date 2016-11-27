package org.kambanaria.knots.orm_models;

public class Currency {

    private final int id;
    private final String name;
    private final String code;

    public Currency(int id, String name, String code) {
        this.id = id;
        this.name = name;
        this.code = code;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        return (obj instanceof Currency)
                && (id == ((Currency) obj).id);
    }

}
