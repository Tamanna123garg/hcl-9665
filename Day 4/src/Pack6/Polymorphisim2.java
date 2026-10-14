package Pack6;
class Animal {
    public void sound() {
        System.out.println("Animal Sounds");
    }
}
class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dogs Barksं");
    }
}
class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cat Sound");
    }
}

public class Polymorphisim2 {
    public static void main(String[] args) {

        Animal myAnimal;

        myAnimal = new Dog();
        myAnimal.sound();

        myAnimal = new Cat();
        myAnimal.sound();
    }
}