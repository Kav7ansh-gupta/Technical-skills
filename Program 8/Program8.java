
import java.util.Scanner;

public class Program8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, m, n, Rs = 0, ls = 0;
        System.out.println("Enter the row of the matrix: ");
        m = sc.nextInt();
        System.out.println("Enter the Coloumn of the matrix: ");
        n = sc.nextInt();
        int[][] arr = new int[m][n];
        System.out.println("Enter the elements of the matrix: ");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }

        }
        for (i = 0; i < m; i++) {
            ls = ls + arr[i][m - 1 - i];
            for (j = 0; j < n; j++) {
                if (i == j) {
                    Rs = Rs + arr[i][j];
                }
            }

        }
        System.out.println("Right Digonal sum is: " + Rs);
        System.out.println("Left Digonal sum is: " + ls);

    }
}
