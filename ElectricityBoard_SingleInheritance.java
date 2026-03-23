import java.util.Scanner;

// Base Class
class Consumer {

    int consumerID;
    String consumerName;
    int unitsConsumed;

    void getConsumerDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Consumer ID: ");
        consumerID = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Consumer Name: ");
        consumerName = sc.nextLine();

        System.out.print("Enter Units Consumed: ");
        unitsConsumed = sc.nextInt();
    }

    void displayConsumerDetails() {
        System.out.println("\nConsumer ID: " + consumerID);
        System.out.println("Consumer Name: " + consumerName);
        System.out.println("Units Consumed: " + unitsConsumed);
    }
}


// Derived Class
class ElectricityBill extends Consumer {

    double billAmount;

    void calculateBill() {

        if (unitsConsumed <= 100) {
            billAmount = unitsConsumed * 1.50;
        }
        else if (unitsConsumed <= 300) {
            billAmount = (100 * 1.50) +
                         ((unitsConsumed - 100) * 2.50);
        }
        else {
            billAmount = (100 * 1.50) +
                         (200 * 2.50) +
                         ((unitsConsumed - 300) * 4.00);
        }
    }

    void displayBill() {
        displayConsumerDetails();
        System.out.println("Total Bill Amount: ₹" + billAmount);
    }
}


// Main Class
public class ElectricityBoard_SingleInheritance {
    public static void main(String[] args) {

        ElectricityBill obj = new ElectricityBill();

        obj.getConsumerDetails();
        obj.calculateBill();
        obj.displayBill();
    }
}