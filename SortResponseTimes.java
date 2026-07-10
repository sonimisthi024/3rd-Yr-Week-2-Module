import java.util.Scanner;

public class SortResponseTimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: number of response times
        int n = sc.nextInt();
        int[] times = new int[n];

        // Input: response times
        for (int i = 0; i < n; i++) {
            times[i] = sc.nextInt();
        }

        // Insertion Sort
        for (int i = 1; i < n; i++) {
            int key = times[i];
            int j = i - 1;

            // Shift elements greater than key to the right
            while (j >= 0 && times[j] > key) {
                times[j + 1] = times[j];
                j--;
            }
            times[j + 1] = key;
        }

        // Output: sorted response times
        for (int i = 0; i < n; i++) {
            System.out.print(times[i] + " ");
        }

        sc.close();
    }
}


