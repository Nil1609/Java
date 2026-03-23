import java.util.Scanner;

public class Array_Size {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n;
        System.out.print("Enter the size of the array:");
        n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

System.out.println("The elements in array are:");
for(int i=0; i<n; i++) {
    System.out.print(arr[i] + " ");


}
sc.close();
    }
}
    
