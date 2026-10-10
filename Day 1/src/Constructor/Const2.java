package Constructor;

public class Const2 {

    int rollNo;
    String name;
    double marks;

    public Const2() {
        rollNo = 0;
        name = "Not Assigned";
        marks = 0.0;
    }


    public Const2(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }


    public Const2(int rollNo, String name) {
        this(rollNo, name, 0.0);
    }

    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("-------------------");
    }

    public static void main(String[] args) {

        Const2 s1 = new Const2();
        Const2 s2 = new Const2(101, "Tamanna", 92.5);
        Const2 s3 = new Const2(102, "Rahul");

        s1.display();
        s2.display();
        s3.display();
    }
}