package Inheritance;

class Animal {

    String name = "Dog";

    void eat() {
        System.out.println(name + " is eating");
    }
}

public class Int1 extends Animal {

    void bark() {
        System.out.println(name + " is barking");
    }

    public static void main(String[] args) {

        Int1 obj = new Int1();

        obj.eat();

        obj.bark();
    }
}