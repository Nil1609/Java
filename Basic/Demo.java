interface A {
    void display1();

}
interface B {
    void display2();
}

interface C extends A, B {
    void display3();
}

abstract class D implements C {
    public void display1() {
        System.out.println("Display 1");
    }

    public void display2() {
        System.out.println("Display 2");
    }

   abstract public void display3();
    }
class E extends D {
    public void display3() {
        System.out.println("C");
        super.display2();
        super.display1();
    }
}

public class Demo {
    public static void main(String[] args) {
        E ob = new E();
        ob.display3();
    }
}