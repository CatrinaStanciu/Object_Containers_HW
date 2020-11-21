import Hobbies.Hobby;
import Persons.*;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        //creare set de persoane cu sortare implicita
        Set<Person> personSet = new TreeSet<>();
        personSet.add(new Employed("Maria Avram", 47));
        personSet.add(new Unemployed("Ana Ionescu", 35));
        personSet.add(new Employed("Doru Dumitrescu", 51));
        personSet.add(new Student("Diana Avram", 21));
        personSet.add(new Student("George Anton", 22));


        //sortare dupa nume, ordinea naturala din clasa Person
        System.out.println("Person list sorted by name:");
        for (Person person : personSet) {
            System.out.println(person);
        }

        //crearea unui nou comparator dupa varsta
        Comparator<Person> ageComparator = new AgeComparator() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getAge() - p2.getAge();
            }
        };

        //schimbarea setului pentru a sorta dupa varsta
        Set<Person> personSet1 = new TreeSet<>(ageComparator);
        personSet1.addAll(personSet);

        System.out.println("---------------------");
        System.out.println("Person list sorted by age:");
        for (Person person : personSet1) {
            System.out.println(person);
        }

        //creare lista de hobby uri
        List<Hobby> hobbies = new ArrayList<>();
        hobbies.add(new Hobby("cycling", "France"));
        hobbies.add(new Hobby("jogging", "Great Britain"));
        hobbies.add(new Hobby("scuba diving", "Australia"));
        hobbies.add(new Hobby("cooking", "Italy"));
        hobbies.add(new Hobby("reading", "Romania"));

        //asocierea persoanelor din set cu hobby uri din lista
        Map<Person, Hobby> personHobbies = new HashMap<>();
        personHobbies.put(new Person("Maria Avram"), hobbies.get(0));
        personHobbies.put(new Person("Ana Ionescu"), hobbies.get(1));
        personHobbies.put(new Person("Doru Dumitrescu"), hobbies.get(2));
        personHobbies.put(new Person("Diana Avram"), hobbies.get(3));
        personHobbies.put(new Person("George Anton"), hobbies.get(4));


        System.out.println("---------------------");
        for (Map.Entry<Person, Hobby> entry : personHobbies.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }
}


