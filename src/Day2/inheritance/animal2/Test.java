package Day2.inheritance.animal2;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal("Cat");
        Dog dog = new Dog();
        dog.eat();
        dog.sleep();
        dog.makeSound();
        animal.eat();
        animal.sleep();
        animal.eat();
        animal.sleep();
    }
}
