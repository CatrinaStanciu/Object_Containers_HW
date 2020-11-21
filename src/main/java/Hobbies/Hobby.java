package Hobbies;

public class Hobby {

    String name;
    String country;
    int frequency;


    public Hobby(String name) {
        this.name = name;
    }
    public Hobby (String name, String country) {
        this.name = name;
        this.country = country;
    }

    public String getHobby() { return name; }

    public String getCountry() {return country; }

    @Override
    public String toString() {
        return "hobby= {" + getHobby() + "/" +
                getCountry() + "}";
    }
}
