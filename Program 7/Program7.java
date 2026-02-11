
import java.util.Scanner;

public class Program7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, m, n;
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
        System.out.println("Elements of the matrix are : ");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
