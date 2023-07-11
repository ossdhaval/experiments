package com.baeldung;

public class Person {
    private int age;

    private String name;

    public int getAge() {
        return age;
    }

    @BuilderProperty(optionalType = "Mandatory", description = "This is PropertyX description")
    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @BuilderProperty(optionalType = "Mandatory", description = "This is PropertyX description")
    public void setName(String name) {
        this.name = name;
    }
}
