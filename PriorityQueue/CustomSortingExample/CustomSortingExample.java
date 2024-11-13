import java.util.*;

class Person {
    String firstName;
    String lastName;

    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}

public class CustomSortingExample {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Ansar", "Shaikh"));
        people.add(new Person("Pratiksha", "Pawade"));
        people.add(new Person("Sanu", "Shaikh"));
        people.add(new Person("suraj", "kadam"));
        people.add(new Person("ashu", "mujhamule"));

        // Sort by last name
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.lastName.compareTo(p2.lastName);
            }
        });

        System.out.println("Sorted by last name:");
        for (Person person : people) {
            System.out.println(person);
        }

        // Sort by last name in descending order
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p2.lastName.compareTo(p1.lastName);
            }
        });

        System.out.println("\nSorted by last name (desc):");
        for (Person person : people) {
            System.out.println(person);
        }
    }
}

