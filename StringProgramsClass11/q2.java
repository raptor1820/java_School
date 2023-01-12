
//program to arrange words of a sentences in ascending order of length
import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        // checking for invalid input
        if (!s.endsWith(".")) {
            System.out.println("Invalid input");
            sc.close();
            return;
        }
        if (!Character.isUpperCase(s.charAt(0))) {
            System.out.println("Invalid input");
            sc.close();
            return;
        }
        // sorting by length except for fullstop
        s = s.substring(0, s.length() - 1);
        String final_sent = "";
        String[] sentences = s.split(" ");
        for (int i = 0; i < sentences.length - 1; i++) {
            for (int j = 0; j < sentences.length - i - 1; j++)
                if (sentences[j].length() > sentences[j + 1].length()) {
                    String temp = sentences[j];
                    sentences[j] = sentences[j + 1];
                    sentences[j + 1] = temp;
                }
        }
        for (int i = 0; i < sentences.length; i++)
            final_sent += sentences[i] + " ";
        final_sent = final_sent.toLowerCase();
        final_sent = final_sent.substring(0, 1).toUpperCase() + final_sent.substring(1);
        System.out.println(final_sent.trim() + ".");
        sc.close();
    }
}
