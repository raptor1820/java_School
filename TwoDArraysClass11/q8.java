import java.util.Scanner; //importing scanner

public class q8 { // start of class
    public static void main(String[] args) { // start of main method
        // taking input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int m = sc.nextInt();
        System.out.println("enter number of columns");
        int n = sc.nextInt();
        int arr[][] = new int[m][n];
        System.out.println("Enter array elements");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // finding sum of boundary elemnenrs and printing non boundary elemennts
        int boundary_sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i != 0 && j != 0 && i != arr.length - 1 && j != arr[i].length - 1) {
                    System.out.print(arr[i][j] + " ");
                } else {
                    boundary_sum += arr[i][j];
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        System.out.println("Sum of boundary elements: " + boundary_sum);

        sc.close();

    } // end of method
} // end of class
