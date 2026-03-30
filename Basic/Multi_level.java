//code to generate multi-level inheritance
class GrandParent {
    void display() {
        System.out.println("This is the grandparent class.");
    }
}

class Parent extends GrandParent {
    void show() {
        System.out.println("This is the parent class.");
    }
}

class Child extends Parent {
    void print() {
        System.out.println("This is the child class.");
    }
}
public class Multi_level {
    public static void main(String[] args) {
        Child c = new Child();
        c.display(); 
        c.show();    
        c.print();   
    }
}