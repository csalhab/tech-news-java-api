package com.technews.testModel;

import java.util.Objects;

public class Demo {
    private String name;
    private int age;

    public Demo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /*
    For Just Tech News app:
    Spring Data JPA will use the equals() method to compare two objects. However, this method compares objects by
    hash code (or reference number), rather than by value. Thus, two distinct objects with the same value would be
    interpreted as NOT equal. We'll override that functionality so that equals() compares objects based on values,
    but we'll also need to override hashCode() when we do that because it is closely linked.
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Demo demo = (Demo) o;
        return age == demo.age && Objects.equals(name, demo.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Demo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
