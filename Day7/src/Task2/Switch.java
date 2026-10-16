package Task2;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a day of the week: ");
        String day = scanner.nextLine().trim();

        switch (day.toLowerCase()) {
            case "monday", "tuesday", "wednesday", "thursday", "friday" ->
                    System.out.println(day + " is a Weekday.");

            case "saturday", "sunday" ->
                    System.out.println(day + " is a Weekend.");

            default ->
                    System.out.println("Invalid day!");
        }

        scanner.close();
    }
}

