package model;

public class Manager {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("in set method");

    }

    public String setNameReturn(String name) {
        this.name = name;
        System.out.println("in set method");
        return name;
    }
}
