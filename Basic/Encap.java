class Student {
    private int age; // age is private, cannot be accessed directly from outside the class

    public void setAge(int age) { // setter method to set the value of age
        if(age > 0) {
            this.age = age;
        }
    }

    public int getAge() { // getter method to retrieve the value of age
        return age;
    }
}

public class Encap { // main class to test encapsulation
    public static void main(String[] args) {
        Student s = new Student(); // create an instance of Student
        s.setAge(20); 
// set the age using the setter method
        System.out.println("Student's age: " + s.getAge()); // retrieve and print the age using the getter method
    }
}