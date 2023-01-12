
//program to input a sentence and find the unique words in it
import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence");
        String sentence = sc.nextLine();
        String[] words = sentence.split(" ");
        String uniqueWords = "";
        // for loop to find the unique words
        for (int i = 0; i < words.length; i++) {
            int count = 0;
            for (int j = 0; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                }
            }
            if (count == 1) {
                uniqueWords += words[i] + "\n";
            }
        }
        System.out.println("Unique words are:\n" + uniqueWords.trim());
        sc.close();
    }
}
