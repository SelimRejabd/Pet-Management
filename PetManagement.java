
interface Train {
    void train();
}

interface Sound {
    void makeSound();
}

class Pet {
    String name;

    Pet(String name) {
        this.name = name;
    }

    void feed() {
        System.out.println(name + " is being fed.");
    }

    void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

class Dog extends Pet implements Train, Sound {
    Dog(String name) {
        super(name);
    }

    @Override
    public void train() {
        System.out.println(name + " is being trained.");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says woof!");
    }
}

class Cat extends Pet implements Sound {
    Cat(String name) {
        super(name);
    }
    public void train() {
        System.out.println(name + "is being trained.");
    }
    @Override
    public void makeSound() {
        System.out.println(name + " says meow!");
    }
}

class Rabbit extends Pet implements Train {
    Rabbit(String name){
        super(name);
    }

    public void train(){
        System.out.println(name + " is being trained.");
    }

}

public class PetManagement {
    public static void main(String[] args) {
        Dog dog = new Dog("Bond");
        
        Cat cat = new Cat("Whisky");

        Rabbit rabbit = new Rabbit("Fin");



        dog.feed();
        dog.train();
        dog.makeSound();
        dog.sleep();

        cat.feed();
        cat.sleep();
        cat.train();
        cat.makeSound();

        rabbit.train();
        rabbit.sleep();
    }
}
