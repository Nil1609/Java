//code to generate single inheritance
class Parent {
    void display() {
        System.out.println("This is the parent class.");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("This is the child class.");
    }
}

class singleInheritance {
    public static void main(String[] args) {
        Child c = new Child();
        c.display(); 
        c.show();    
    }
}