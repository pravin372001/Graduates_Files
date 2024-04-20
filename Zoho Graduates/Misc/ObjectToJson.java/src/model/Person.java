package model;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private String name;
    private String surname;
    private List<Integer> list;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
        list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);

    }

    public String toString() {
        return name + " " + surname;
    }
}
