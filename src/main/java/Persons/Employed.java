package Persons;


public class Employed extends Person{

    public Employed(String name, int age) {
      super(name,age);
    }



    public String toString() {
        return "Employed{" +
                "name= " + getName() + ";" +
                "age= " + getAge() + "}";

    }


}
