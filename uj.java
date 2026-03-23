class Student {
    int roll;
    String Name;
    String Department;
}
public class uj {
    public static void main(String[] args) {
    
    // Take user input for another student
    Student s2 = new Student();
    java.util.Scanner sc = new java.util.Scanner(System.in);
    
    System.out.print("Enter Roll: ");
    s2.roll = sc.nextInt();
    
    System.out.print("Enter Name: ");
    s2.Name = sc.next();
    
    System.out.print("Enter Department: ");
    s2.Department = sc.next();
    
    System.out.println("Roll: " + s2.roll + ", Name: " + s2.Name + ", Department: " + s2.Department);
    sc.close();
    }
}