package Pack6;
public class Polymorphism {
    public int add(int a, int b) {
        return a + b;
    }
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    public static void main(String[] args) {
        Polymorphism obj = new Polymorphism();
        System.out.println("Add two numbers: " + obj.add(5, 10));
        System.out.println("Add three numbers: " + obj.add(5, 10, 15));
    }
}
