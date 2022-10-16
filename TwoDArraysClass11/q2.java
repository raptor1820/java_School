import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows");
        int m = sc.nextInt();
        System.out.println("enter the number of columns");
        int n = sc.nextInt();
        int arr[][] = new int[m][n];
        int x = 0;
        int y = 1;
        int temp = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == 0 && j == 0) {
                    arr[i][j] = x;
                } else if (i == 0 && j == 1) {
                    arr[i][j] = y;
                } else {
                    temp = x;
                    x = y;
                    y = y + temp;
                    arr[i][j] = y;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}