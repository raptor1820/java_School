
//program to reverse sentence in a specified format
import java.util.Scanner;
import java.util.StringTokenizer;

public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of lines");
        int n = sc.nextInt();
        sc.nextLine();
        // checking for invalid input
        if (n > 20) {
            System.out.println("Number of lines should be less than or equal to 20");
            System.exit(0);
        }
        // reversing the sentence
        String sentence = "";
        System.out.println("Enter the lines");
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            s.replace(",", "")
                    .replace(";", "")
                    .replace(":", "")
                    .replace("'", "")
                    .replace("\"", "");
            String sentences[] = s.split("[.?!]");
            String finalSent = "";
            for (int j = sentences.length - 1; j >= 0; j--) {
                StringTokenizer st = new StringTokenizer(sentences[j]);
                String sent = "";
                while (st.hasMoreTokens()) {
                    String word = st.nextToken();
                    sent = word + " " + sent;
                }
                finalSent += sent;
            }
            sentence += finalSent + "\n";
        }
        System.out.println(sentence.trim());
        sc.close();
    }
}
