package ru.artemgggi.springmvc.model;

import java.util.Objects;
import java.util.Set;

public class Accident {
    private int id;
    private String name;
    private String text;
    private String address;

    private AccidentType accidentType;

    private Set<Rule> rules;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Accident accident = (Accident) o;
        return id == accident.id && name.equals(accident.name)
                && text.equals(accident.text) && address.equals(accident.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, text, address);
    }
}
