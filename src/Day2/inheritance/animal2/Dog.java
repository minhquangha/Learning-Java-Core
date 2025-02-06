package Day2.inheritance.animal2;

public class Dog extends Animal {
    public Dog() {
        super("Dog");
    }

    @Override
    public void eat() {
        System.out.println("Dog eats dog");
    }

    @Override
    public void makeSound() {
        System.out.println("Dog makes sound");
    }

    @Override
    public void sleep() {
        System.out.println("Dog sleeps dog");
    }
}
