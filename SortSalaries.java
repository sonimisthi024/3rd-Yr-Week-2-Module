import java.util.Scanner;

public class SortSalaries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: number of employees
        int n = sc.nextInt();
        int[] salaries = new int[n];

        // Input: salaries
        for (int i = 0; i < n; i++) {
            salaries[i] = sc.nextInt();
        }

        // Bubble Sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (salaries[j] > salaries[j + 1]) {
                    // swap
                    int temp = salaries[j];
                    salaries[j] = salaries[j + 1];
                    salaries[j + 1] = temp;
                }
            }
        }

        // Output: sorted salaries
        for (int i = 0; i < n; i++) {
            System.out.print(salaries[i] + " ");
        }

        sc.close();
    }
}

