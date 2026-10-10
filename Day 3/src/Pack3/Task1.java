package Pack3;

import java.util.ArrayList;
import java.util.Comparator;

class Student {
    String name;
    int rollno;
    int age;
    double marks;

    Student(String name, int rollno, int age, double marks) {
        this.name = name;
        this.rollno = rollno;
        this.age = age;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Name: " + name +
                ", Roll No: " + rollno +
                ", Age: " + age +
                ", Marks: " + marks;
    }
}

public class Task1 {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Tamanna", 101, 21, 92.5));
        students.add(new Student("Rahul", 102, 22, 85.0));
        students.add(new Student("Priya", 103, 20, 89.5));
        students.add(new Student("Aman", 104, 23, 78.0));
        students.add(new Student("Neha", 105, 21, 95.0));
        students.add(new Student("Rohit", 106, 22, 81.5));
        students.add(new Student("Anjali", 107, 20, 91.0));
        students.add(new Student("Karan", 108, 24, 75.5));
        students.add(new Student("Simran", 109, 21, 88.0));
        students.add(new Student("Vikas", 110, 23, 84.5));

        System.out.println("Original Student List:");
        students.forEach(System.out::println);

        students.sort(Comparator.comparingInt(s -> s.age));

        System.out.println("\nStudents Sorted by Age:");
        students.forEach(System.out::println);

        students.sort(Comparator.comparingDouble(s -> s.marks));

        System.out.println("\nStudents Sorted by Marks:");
        students.forEach(System.out::println);
    }
}