
//program to find number of words and frequency of words
import java.util.Scanner;
import java.util.StringTokenizer;

class q3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of sentences");
        int n = sc.nextInt();
        sc.nextLine();
        // checking for invalid input
        if (!(n > 0 && n <= 4)) {
            System.out.println("invalid number of sentences");
            sc.close();
            return;
        }
        System.out.println("enter sentences");
        String s = sc.nextLine();
        String[] sentences = s.split("[].?!]");
        if (sentences.length != n) {
            System.out.println("Invalid no of sentences");
            sc.close();
            return;
        }
        s = s.toUpperCase();
        // finding numnber of words and their frequency
        StringTokenizer st = new StringTokenizer(s, " .?!");
        int count = st.countTokens();
        System.out.println();
        System.out.println("Total number of words: " + count);
        String words[] = new String[count];
        int nums[] = new int[count];
        int indexOfWord = 0;
        for (int i = 0; i < count; i++) {
            String word = st.nextToken();
            int j = 0;

            for (j = 0; j < indexOfWord; j++) {
                if (words[j].equals(word)) {
                    nums[j]++;
                    break;
                }
            }
            if (j == indexOfWord) {
                words[indexOfWord] = word;
                nums[indexOfWord]++;
                indexOfWord++;
            }
        }
        for (int i = 0; i < indexOfWord - 1; i++) {
            for (int j = 0; j < indexOfWord - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;

                    String temp2 = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = temp2;
                }
            }
        }

        // Display the words and frequencies
        System.out.println("Word\tFrequency");
        for (int i = 0; i < words.length; i++)
            if (words[i] != null)
                System.out.println(words[i] + "\t" + nums[i]);
        sc.close();
    }

}