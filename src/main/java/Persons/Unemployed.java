package Persons;

public class Unemployed extends Person{

    public Unemployed(String name, int age) {
        super(name, age);
    }


    public String toString() {
        return "Unemployed{" +
                "name= " + getName() + ";" +
                "age= " + getAge() + "}";

    }

}
