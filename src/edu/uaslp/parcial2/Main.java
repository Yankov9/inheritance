package edu.uaslp.parcial2;


public class Main {
    public static void main(String[] args) {
    Animal animal = new Animal();
    Bird bird = new Bird();
    Dog dog = new Dog();
    Cat cat = new Cat();
    Duck duck = new Duck();

    animal.setColor("RED");
    animal.setSize(20);
    animal.setNumberOfLegs(4);
    animal.eat();

    bird.setColor("GREEN");
    bird.setSize(25);
    bird.setNumberOfLegs(2);
    bird.walk();
    bird.eat();

    dog.setSize(10);
    dog.setColor("YELLOW");
    dog.setNumberOfLegs(4);
    dog.eat();
    dog.walk();

    cat.setColor("GRAY");
    cat.setSize(8);
    cat.setNumberOfLegs(4);
    cat.meow();

    duck.setColor("WHITE");
    duck.setSize(4);
    duck.setNumberOfLegs(2);
    duck.fly();

    }
}
