import java.util.Scanner; //importing Scanner

//to find the matrix product
public class q9 { // start of class
    public static void main(String[] args) {
        // takign input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows in matrix 1");
        int m_1 = sc.nextInt();
        System.out.println("Enter the number of columns in matrix 1");
        int n_1 = sc.nextInt();
        System.out.println("Enter the number of rows in matrix 2");
        int m_2 = sc.nextInt();
        System.out.println("Enter the number of columns in matrix 2");
        int n_2 = sc.nextInt();
        if (n_1 != m_2) {
            System.out.println("Matrix multiplication not possible");
            System.exit(0);
        }
        int arr1[][] = new int[m_1][n_1];
        int arr2[][] = new int[m_2][n_2];
        System.out.println("Enter elements in matrix 1");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements in matrix 2");
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        // result matrix
        int result[][] = new int[m_1][n_2];

        // matrix multiplication
        for (int i = 0; i < m_1; i++) {
            for (int j = 0; j < n_2; j++) {
                for (int k = 0; k < n_1; k++) {
                    result[i][j] += arr1[i][k] * arr2[k][j];
                }
            }

        }

        // printing multiplied matrice
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    } // end of method
} // end of class
