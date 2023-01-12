
//caesar cipher encode a string
import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        System.out.println("Enter a string");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s2 = "";
        // check if the string is valid
        if (s.length() > 3 && s.length() < 100) {
            // for loop to encode the string
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (Character.isLetter(c)) {
                    if ((c >= 97 && c <= 110) || (c >= 65 && c <= 78)) {
                        c += 13;
                    } else {
                        c -= 13;
                    }
                }
                s2 += c;
            }
        } else {
            System.out.println("Invalid length");
        }
        System.out.println(s2);
        sc.close();
    }

}