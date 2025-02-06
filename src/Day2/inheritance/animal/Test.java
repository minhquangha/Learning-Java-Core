package Day2.inheritance.animal;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal("messi");
        animal.eat();
        Dog dog = new Dog();
        BabyDog babyDog = new BabyDog();
        babyDog.eat();
        babyDog.bark();
        babyDog.weep();
        dog.eat();
        dog.bark();
        Bird bird = new Bird();
        bird.eat();
        bird.fly();
        Cat cat = new Cat();
        cat.eat();
        cat.meow();

    }
}
