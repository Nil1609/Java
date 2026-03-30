//code to generate hierarchical inheritance
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("The cat meows.");
    }
}

public class hierarchical {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();

        d.eat(); 
        d.bark();

        c.eat(); 
        c.meow(); 
    }
}