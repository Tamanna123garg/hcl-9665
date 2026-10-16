package Pack9;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
class Person {
    private String name;
    private String gender;

    public Person(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }
}
public class Stream2 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("John", "Male"),
                new Person("Sarah", "Female"),
                new Person("Robert", "Male"),
                new Person("Emily", "Female")
        );

        List<String> formattedNames = people.stream()
                .map(person -> {
                    if (person.getGender().equalsIgnoreCase("Male")) {
                        return "Mr. " + person.getName();
                    } else {
                        return "Mrs. " + person.getName();
                    }
                })
                .collect(Collectors.toList());

        System.out.println("Formatted Names: " + formattedNames);
    }
}
