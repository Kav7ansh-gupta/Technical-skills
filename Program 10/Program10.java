
import java.util.Scanner;

public class Program10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of row : ");
        int row = sc.nextInt();
        System.out.println("Enter the size of column : ");
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < row; i++) {
            int rowSum = 0, colSum = 0;
            for (int j = 0; j < col; j++) {
                rowSum = rowSum + arr[i][j];
                colSum = colSum + arr[j][i];
            }
            System.out.println("Row number " + (i + 1) + " is : " + rowSum);
            System.out.println("Column number " + (i + 1) + " is : " + colSum);
        }
    }
}
