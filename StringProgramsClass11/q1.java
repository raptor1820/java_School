
//program to count number of words and vowels in a paragraph
import java.util.Scanner;
import java.util.StringTokenizer;

class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = " " + s + " ";
        int word_count = 0;
        int vovel_count = 0;
        int sentence_count = 0;
        System.out.println(
                "Sentence" + "\t" + "vowels" + "\t" + "words");
        // counting words and vowels
        for (int i = 0; i < s.length() - 1; i++) {
            if ((s.charAt(i) == '.' || s.charAt(i) == '?' || s.charAt(i) == '!') && (s.charAt(i + 1) == ' ')) {
                sentence_count++;
                System.out.println(
                        sentence_count + "\t\t" + vovel_count + "\t" + word_count + " ");
                word_count = 0;
                vovel_count = 0;
            } else if (s.charAt(i) == ' ') {
                word_count++;
            } else if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
                    || s.charAt(i) == 'u' || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I'
                    || s.charAt(i) == 'O' || s.charAt(i) == 'U') {
                vovel_count++;
            }

        }
        // printing V or W on the scale 1:3
        System.out.println("Sentence\t\tNo. of vowels/words");
        String s_new = s.substring(0, s.length() - 1);
        String sentences[] = s_new.split("[.?!]");
        for (int i = 0; i < sentences.length; i++) {
            StringTokenizer st = new StringTokenizer(sentences[i]);
            int words = st.countTokens();
            int vowels = 0;
            while (st.hasMoreTokens()) {
                String word = st.nextToken();
                for (int j = 0; j < word.length(); j++) {
                    if (word.charAt(j) == 'a' || word.charAt(j) == 'e' || word.charAt(j) == 'i'
                            || word.charAt(j) == 'o' || word.charAt(j) == 'u' || word.charAt(j) == 'A'
                            || word.charAt(j) == 'E' || word.charAt(j) == 'I' || word.charAt(j) == 'O'
                            || word.charAt(j) == 'U') {
                        vowels++;
                    }
                }
            }
            String v = "";
            String w = "";
            for (int k = 1; k <= vowels * 3; k++) {
                v += "V";
            }
            for (int j = 1; j <= words * 3; j++) {
                w += "W";
            }
            System.out.println((i + 1) + "\t\t\t" + v + "\n\t\t\t" + w);
        }
        sc.close();
    }
}