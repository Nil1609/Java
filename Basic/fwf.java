import java.util.Scanner;

public class fwf {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String name;
    int age;

    System.out.print("Enter your name:");
    name = sc.nextLine();
    System.out.print("Enter your age:");
    age = sc.nextInt();

    if(age>=18){
        System.out.println("Hello " +name+ ", you are eligible to vote.");
        }else{
            System.out.println("Hello " +name+", you are not eligible to vote.");
        }
        sc.close();
    }
}