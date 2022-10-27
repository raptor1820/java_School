import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the order of matrix");
        int n = sc.nextInt();
        int n_largest = Integer.MIN_VALUE + 1;
        int second_largest = Integer.MIN_VALUE;
        int largest[] = new int[2];
        int s_largest[] = new int[2];
        int arr[][] = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
                if (arr[i][j] > n_largest) {
                    second_largest = n_largest;
                    s_largest[0] = largest[0];
                    s_largest[1] = largest[1];
                    n_largest = arr[i][j];
                    largest[0] = i;
                    largest[1] = j;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(
                "Largest element is " + n_largest + " at row " + (largest[0] + 1) + " column " + (largest[1] + 1));
        System.out.println(
                "Second Largest element is " + second_largest + " at row " + (s_largest[0] + 1) + " column "
                        + (s_largest[1] + 1));
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sort(arr[i]);
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }

    public static int[] sort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
