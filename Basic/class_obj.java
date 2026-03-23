class Student {
    int id;
    String name;
    float marks;

    void displayDetails() {
        System.out.println("Student ID:" + id);
        System.out.println("Student Name:" + name);
        System.out.println("Student Marks:" + marks);
    }
}

    public class class_obj {
        public static void main(String[] args) {
            Student s1 = new Student();
            s1.id = 101;
            s1.name = "Alice";
            s1.marks = -85.5f;
            s1.displayDetails();
        }
    }