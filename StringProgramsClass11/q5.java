
//program to find out words beginning and ending with vowels and sorting them first in the sentence
import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();
        int vowelcount = 0;
        // checking for invalid input
        if (!(s.charAt(s.length() - 1) == '.' || s.charAt(s.length() - 1) == '!' || s.charAt(s.length() - 1) == '?')) {
            System.out.println("Invalid input. Does not end with . ?or !");
            sc.close();
            return;
        }
        for (int i = 0; i < s.length() - 1; i++)
            if (Character.isLetter(s.charAt(i)) && Character.isLowerCase(s.charAt(i))) {
                System.out.println("Invalid input. All must be caps.");
                sc.close();
                return;
            }
        // finding words which begin and end with a vowel and sorting
        s = s.substring(0, s.length() - 1);
        String[] words = s.split(" ");
        String str = "";
        String str2 = "";
        for (int i = 0; i < words.length; i++) {
            char first = words[i].charAt(0);
            char last = words[i].charAt(words[i].length() - 1);
            if (isVowel(first) && isVowel(last)) {
                vowelcount++;
                str += words[i] + " ";
            } else {
                str2 += words[i] + " ";
            }
        }
        System.out.println("NUMBER OF WORDS BEGINNING AND ENDING WITH A VOWEL: " + vowelcount);
        System.out.println(str + str2);
        sc.close();
    }

    // method to check for vowels
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        switch (c) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return true;

        }
        return false;
    }
}
