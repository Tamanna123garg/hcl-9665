package Pack9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {


        List<String> names = Arrays.asList("Alex", "Brandon", "Anna", "Charlie", "Amanda");

        System.out.println("Original List: " + names);


        List<String> filteredNames = names.stream()
                .filter(name -> name.startsWith("A"))  // Intermediate operation
                .map(String::toUpperCase)              // Intermediate operation
                .collect(Collectors.toList());         // Terminal operation

        System.out.println("Filtered & Uppercased: " + filteredNames);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);


        int sumOfEvens = numbers.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(n -> n)
                .sum();

        System.out.println("Sum of even numbers: " + sumOfEvens);
    }
}
