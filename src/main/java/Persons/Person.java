package Persons;

import java.util.Objects;

public class Person implements Comparable<Person>{

    private String name;
    private int age;
    int frequency;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }



    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }



    @Override
    public int compareTo(Person p) {
        return this.name.compareTo(p.getName());
    }

    @Override
    public String toString() {
        return "Person{" +
                "name= " + getName() + "}" ;
    }

    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }*/

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

