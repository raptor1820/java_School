
//program of enncode odd sentences and reverse even sentences
import java.util.Scanner;
import java.util.StringTokenizer;

public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of sentences");
        int n = sc.nextInt();
        // checking for invalid input
        if (!(n > 0 && n <= 10)) {
            System.out.println("invalid number of sentences");
            sc.close();
            return;
        }
        sc.nextLine();

        System.out.println("enter sentences");
        String sentences[] = new String[n];
        for (int i = 0; i < n; i++) {
            sentences[i] = sc.nextLine();
            if (!sentences[i].endsWith(".")) {
                System.out.println("Invalid input. Must end with fullstop.");
                sc.close();
                return;
            }
        }
        // encoding and reversing
        for (int i = 0; i < sentences.length; i++) {
            sentences[i] = sentences[i].substring(0, sentences[i].length() - 1);
            if (i % 2 == 0) {
                String final_str = "";
                for (int j = 0; j < sentences[i].length(); j++) {
                    char c = sentences[i].charAt(j);
                    if (Character.isLetter(c)) {
                        if (Character.isUpperCase(c)) {
                            c = (char) (((int) c + 2 - 65) % 26 + 65);
                        } else {
                            c = (char) (((int) c + 2 - 97) % 26 + 97);
                        }
                    } else {
                    }
                    final_str += c;
                }
                sentences[i] = final_str.trim() + ".";
            } else {
                StringTokenizer st = new StringTokenizer(sentences[i], " ");
                String final_str = "";
                String words[] = new String[st.countTokens()];
                int index = 0;
                while (st.hasMoreTokens()) {
                    words[index] = st.nextToken();
                    index++;
                }
                for (int j = words.length - 1; j >= 0; j--) {
                    final_str += words[j] + " ";
                }
                sentences[i] = final_str.trim() + ".";
            }
        }
        System.out.println();
        for (int i = 0; i < sentences.length; i++)
            System.out.println(sentences[i]);
        sc.close();
    }
}
