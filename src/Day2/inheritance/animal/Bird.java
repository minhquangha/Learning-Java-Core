package Day2.inheritance.animal;


public class Bird extends Animal{

    public Bird() {
        super("Bird");
    }

    public void fly() {
        System.out.println("I'm flying");
    }
}