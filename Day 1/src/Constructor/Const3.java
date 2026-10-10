package Constructor;

public class Const3 {

    int id;
    String name;
    double salary;


    public Const3() {
        this(0, "Unknown");
        System.out.println("Default constructor called");
    }


    public Const3(int id, String name) {
        this(id, name, 25000.0);
        System.out.println("Two-parameter constructor called");
    }


    public Const3(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        System.out.println("Three-parameter constructor called");
    }

    public void display() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {

        Const3 emp1 = new Const3();
        emp1.display();

        Const3 emp2 = new Const3(101, "Tamanna");
        emp2.display();

        Const3 emp3 = new Const3(102, "Rahul", 45000.0);
        emp3.display();
    }
}