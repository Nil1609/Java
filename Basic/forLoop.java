import java.util.Scanner;

public class forLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum=0;
        System.out.print("Enter value of n:");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++) {
            sum = sum + i;
        }
        System.out.println("The sum of first " + n + " natural numbers is: " + sum);
        sc.close();
    
    }
}