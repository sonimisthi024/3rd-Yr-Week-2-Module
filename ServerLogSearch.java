import java.util.Scanner;

public class ServerLogSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: number of log IDs
        int n = sc.nextInt();
        int[] logs = new int[n];

        // Input: sorted log IDs
        for (int i = 0; i < n; i++) {
            logs[i] = sc.nextInt();
        }

        // Input: target log ID
        int target = sc.nextInt();

        // Binary Search
        int low = 0, high = n - 1;
        boolean found = false;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (logs[mid] == target) {
                found = true;
                break;
            } else if (logs[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        // Output
        if (found)
            System.out.println("Log Found");
        else
            System.out.println("Log Not Found");

        sc.close();
    }
}
