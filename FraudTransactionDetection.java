import java.util.Scanner;

public class FraudTransactionDetection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: number of transactions
        int n = sc.nextInt();
        int[] transactions = new int[n];

        // Input: transaction IDs
        for (int i = 0; i < n; i++) {
            transactions[i] = sc.nextInt();
        }

        // Input: suspicious transaction ID
        int suspiciousID = sc.nextInt();

        // Linear search
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (transactions[i] == suspiciousID) {
                found = true;
                break;
            }
        }

        // Output
        if (found)
            System.out.println("Fraud Transaction Found");
        else
            System.out.println("Transaction Not Found");

        sc.close();
    }
}
 