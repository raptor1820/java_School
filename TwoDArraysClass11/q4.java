import java.util.Scanner;

//program to input elements in spiral order 
public class q4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows");
        int m = sc.nextInt();
        System.out.println("enter number of columns");
        int n = sc.nextInt();
        int arr[][] = new int[m][n];
        /*
         * recursive approach is used here
         * shell() takes input for only the outer layer of the array
         * mid stores the number of layers, which is half of the number of rows or
         * columns whichever is lesser
         * calling shell() for each layer of the array effectively returns an array in
         * spiral order
         */

        int mid = arr.length > arr[0].length ? (int) Math.ceil(arr[0].length / 2) : (int) Math.ceil(arr.length / 2);

        for (int i = 0; i < mid; i++) {
            shell(arr, i, arr[0].length - i - 1, i, arr.length - i - 1);
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }

    // iterate through first row, last column, last row and first column in order
    public static void shell(int arr[][], int col_start, int col_end, int row_start, int row_end) {
        for (int i = col_start; i < col_end; i++) {
            arr[row_start][i] = new Scanner(System.in).nextInt();
        }
        for (int i = row_start; i < row_end; i++) {
            arr[i][col_end] = new Scanner(System.in).nextInt();
        }
        for (int i = col_end; i > col_start; i--) {
            arr[row_end][i] = new Scanner(System.in).nextInt();
        }
        for (int i = row_end; i > row_start; i--) {
            arr[i][col_start] = new Scanner(System.in).nextInt();
        }

    }
}
