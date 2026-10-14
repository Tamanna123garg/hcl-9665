package Pack7;
interface Greeting {
    void sayHello(String name);
}
interface Calculator {
    int operate(int a, int b);
}

public class LambdaExpression {
    public static void main(String[] args) {


        Greeting greet = (name) -> System.out.println("Hello, " + name + "!");


        Calculator addition = (a, b) -> a + b;
        Calculator multiplication = (a, b) -> a * b;


        greet.sayHello("Geek");
        System.out.println("Addition Result: " + addition.operate(20, 10));
        System.out.println("Multiplication Result: " + multiplication.operate(20, 10));
    }
}
