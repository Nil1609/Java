import java.util.Scanner;

public class FraudDetection {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of transactions: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter transaction amounts:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter suspicious target amount: ");
        int target = sc.nextInt();

        // Brute Force Logic
        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {

                if (nums[i] + nums[j] == target) {
                    System.out.println("Indices: [" + i + ", " + j + "]");
                    sc.close();
                    return;   // stop program once found
                }
            }
        }

        sc.close();
    }
}