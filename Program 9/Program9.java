
import java.util.Scanner;

public class Program9 {

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
        int UpperSum = 0, lowerSum = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i<j){
                    UpperSum = UpperSum+arr[i][j];
                }
                if (i>j){
                    lowerSum = lowerSum+arr[i][j];
                }
            }

        }
        System.out.println("Upper Digonal sum = "+UpperSum);
        System.out.println("Lower Digonal sum = "+lowerSum);

    }
}
