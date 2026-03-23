import java.util.Scanner;

// Base Class
class Person {

    int personID;
    String personName;

    void getPersonDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Person ID: ");
        personID = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Person Name: ");
        personName = sc.nextLine();
    }

    void displayPersonDetails() {
        System.out.println("\nPerson ID: " + personID);
        System.out.println("Person Name: " + personName);
    }
}


// Level 2 Class
class Employee extends Person {

    double basicSalary;

    void getEmployeeDetails() {
        Scanner sc = new Scanner(System.in);

        getPersonDetails();

        System.out.print("Enter Basic Salary: ");
        basicSalary = sc.nextDouble();
    }
}


// Level 3 Class
class Salary extends Employee {

    double hra, da, totalSalary;

    void calculateSalary() {

        hra = basicSalary * 0.20;
        da = basicSalary * 0.10;

        totalSalary = basicSalary + hra + da;
    }

    void displaySalary() {
        displayPersonDetails();
        System.out.println("Basic Salary: ₹" + basicSalary);
        System.out.println("HRA: ₹" + hra);
        System.out.println("DA: ₹" + da);
        System.out.println("Total Salary: ₹" + totalSalary);
    }
}


// Main Class
public class EmployeeSalary_MultiLevel_Inher {
    public static void main(String[] args) {

        Salary obj = new Salary();

        obj.getEmployeeDetails();
        obj.calculateSalary();
        obj.displaySalary();
    }
}