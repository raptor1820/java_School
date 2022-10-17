import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {

        // taking array input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int m = sc.nextInt();
        System.out.println("Enter number of columns:");
        int n = sc.nextInt();
        int arr[][] = new int[m][n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // reversing the array
        int arr_rev[][] = new int[m][n];
        for (int i = 0; i < arr.length; i++) {
            for (int k = 0, j = arr[i].length - 1; j >= 0 && k < arr[i].length; j--, k++) {
                arr_rev[i][j] = arr[i][k];
            }
        }

        // printing original and reverse
        System.out.println("Original array");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("New array");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr_rev[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}