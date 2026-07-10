import java.util.Scanner;

public class BugReportPriorities {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: number of bug reports
        int n = sc.nextInt();
        int[] priorities = new int[n];

        // Input: priority scores
        for (int i = 0; i < n; i++) {
            priorities[i] = sc.nextInt();
        }

        // Selection Sort
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (priorities[j] < priorities[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap
            int temp = priorities[minIndex];
            priorities[minIndex] = priorities[i];
            priorities[i] = temp;
        }

        // Output: sorted priorities
        for (int i = 0; i < n; i++) {
            System.out.print(priorities[i] + " ");
        }

        sc.close();
    }
}

