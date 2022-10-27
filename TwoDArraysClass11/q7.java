import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter order of the matrix");
        int n = sc.nextInt();
        int arr[][] = new int[n][n];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        boolean flag = true;
        for (int i = 0; i < arr.length; i++) {
            int min_row = arr[i][0];
            int min_col_idx = 0;
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < min_row) {
                    min_row = arr[i][j];
                    min_col_idx = j;
                }
            }
            int max_col = arr[0][min_col_idx];
            int max_row_idx = 0;
            for (int k = 0; k < arr.length; k++) {
                if (arr[k][min_col_idx] > max_col) {
                    max_col = arr[k][min_col_idx];
                    max_row_idx = k;
                }
            }
            if (max_col == min_row) {
                System.out.println("Saddle point is: " + max_col + " at row " + (max_row_idx + 1) + " column "
                        + (min_col_idx + 1));
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("No saddle point");
        }
        sc.close();
    }
}