
//program to merge two arrays and sort them in alphabetical order
import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of names in array A");
        int n = sc.nextInt();
        System.out.println("Enter number of names in array B");
        int m = sc.nextInt();
        String[] a = new String[n];
        String[] b = new String[m];
        System.out.println("Enter names in array A");
        for (int i = 0; i < n; i++) {
            a[i] = sc.next();
        }
        System.out.println("Enter names in array B");
        for (int i = 0; i < m; i++) {
            b[i] = sc.next();
        }
        String[] c = new String[n + m];
        int i = 0, j = 0, k = 0;
        // creating merged array
        while (i < n) {
            c[k++] = a[i++];
        }
        while (j < m) {
            c[k++] = b[j++];
        }
        // Sorting a in alphabetical order
        for (i = 0; i < n; i++) {
            for (j = i + 1; j < n; j++) {
                if (a[i].compareTo(a[j]) > 0) {
                    String temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        // Sorting b in alphabetical order
        for (i = 0; i < m; i++) {
            for (j = i + 1; j < m; j++) {
                if (b[i].compareTo(b[j]) > 0) {
                    String temp = b[i];
                    b[i] = b[j];
                    b[j] = temp;
                }
            }
        }
        // Sorting c in alphabetical order
        for (i = 0; i < n + m; i++) {
            for (j = i + 1; j < n + m; j++) {
                if (c[i].compareTo(c[j]) > 0) {
                    String temp = c[i];
                    c[i] = c[j];
                    c[j] = temp;
                }
            }
        }
        System.out.println("Array A is");
        for (String s : a) {
            System.out.print(s + " ");
        }
        System.out.println("\n\nArray B is");
        for (String s : b) {
            System.out.print(s + " ");
        }
        System.out.println("\n\nMerged array is");
        for (String s : c) {
            System.out.print(s + " ");
        }
        sc.close();
    }
}
