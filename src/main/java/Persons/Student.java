package Persons;



public class Student extends Person{

    public Student(String name, int age) {
        super(name, age);
    }



    public String toString() {
        return "Student{" +
                "name= " + getName() + ";" +
                "age= " + getAge() + "}";

    }


}
