package Interface;

interface Animal {
    void sound();
}

public class inter1 implements Animal {

    @Override
    public void sound() {
        System.out.println("Dog barks");
    }

    public static void main(String[] args) {
        inter1 obj = new inter1();
        obj.sound();
    }
}