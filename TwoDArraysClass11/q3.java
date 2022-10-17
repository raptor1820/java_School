import java.util.Scanner;;

public class q3 {
    public static void main(String[] args) {

        // scanner object creation and basic 2D array setup
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the matrix: ");
        int m = sc.nextInt();
        int arr[][] = new int[m][m];

        // taking array input
        System.out.println("Enter array elements: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // displaying the array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // calling checkSymmetry()
        if (checkSymmetry(arr)) {
            System.out.println("Array is symmetric");
        } else {
            System.out.println("Array is not symmetric");
        }

        // finding sum of left diagonal and right diagonal
        int l_diag = 0;
        int r_diag = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    l_diag += arr[i][j];
                }
                if (i + j == arr.length - 1) {
                    r_diag += arr[i][j];
                }
            }
        }

        // printing sums
        System.out.println("left diagonal: " + l_diag);
        System.out.println("right diagonal: " + r_diag);
        sc.close();
    }

    // method to check array symmetry
    public static boolean checkSymmetry(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] != arr[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }
}
