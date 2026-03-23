import java.util.Scanner;

// 1️⃣ Student Class
class Student {

    int rollNumber;
    String studentName;
    double marks;

    // Static variable (common for all students)
    static String collegeName = "Adamas University";

    // Constructor
    Student(int rollNumber, String studentName, double marks) {
        this.rollNumber = rollNumber;
        this.studentName = studentName;
        this.marks = marks;
    }

    // Static method
    static void displayCollegeName() {
        System.out.println("College Name: " + collegeName);
    }

    // Method Overloading - displayInfo()
    void displayInfo(int rollNumber, String studentName) {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Student Name: " + studentName);
    }

    void displayInfo(int rollNumber, String studentName, double marks) {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Student Name: " + studentName);
        System.out.println("Marks: " + marks);
    }
}


// 2️⃣ Authentication Class
class Authentication {

    // Static predefined credentials
    static String predefinedUsername = "admin";
    static String predefinedPassword = "1234";

    // Overloaded login() method (only username)
    void login(String username) {
        if (username.equals(predefinedUsername)) {
            System.out.println("Username Correct. Please Enter Password.");
        } else {
            System.out.println("Invalid Username or Password");
        }
    }

    // Overloaded login() method (username + password)
    void login(String username, String password) {
        if (username.equals(predefinedUsername) &&
            password.equals(predefinedPassword)) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Invalid Username or Password");
        }
    }
}


// 3️⃣ Main Application Class
public class CollegeUtilityManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Accept Student Details
        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();
        sc.nextLine(); // clear buffer

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble();

        // Create Student Object using Constructor
        Student s1 = new Student(roll, name, marks);

        // Call Static Method
        Student.displayCollegeName();

        System.out.println("\n--- Student Details (Overloaded Method 1) ---");
        s1.displayInfo(roll, name);

        System.out.println("\n--- Student Details (Overloaded Method 2) ---");
        s1.displayInfo(roll, name, marks);

        // Authentication
        Authentication auth = new Authentication();

        sc.nextLine(); // clear buffer

        System.out.print("\nEnter Username: ");
        String username = sc.nextLine();

        // First overloaded method
        auth.login(username);

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        // Second overloaded method
        auth.login(username, password);

        sc.close();
    }
}