class Student {
    private int age;
    String name;

    void setAge(int age) {
        if(age>0) {
            this.age = age;
        } else {
            System.out.println("Invalid age. Age must be positive.");
        }
    }   

    int getAge() {
        return age;
    }

    Student(int age, String name) {
        this.age=age;
        this.name=name;
    }

    void displayDetails() {
        System.out.println("Student Name:" + name);
        System.out.println("Student Age:" + age);
    }

   
}

 public class Constructor{
        public static void main(String[] args) {
            Student s1 = new Student(20, "Alice");
            s1.displayDetails();
            s1.setAge(-5); // Invalid age
        }
    }