
//program to decode raw string of asii values to a read-able string
import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the coded string");
        StringBuffer codedString = new StringBuffer(sc.nextLine()).reverse();
        String fString = "";
        // for loop to decode the values
        for (int i = 0; i < codedString.length();) {
            String asciiValueStr = codedString.substring(i, i + 2);
            int asciiValue = Integer.parseInt(asciiValueStr);
            if (asciiValue >= 65 && asciiValue <= 90 || asciiValue >= 97 && asciiValue <= 99) {
                fString += (char) asciiValue;
            } else if (asciiValue == 32) {
                fString += " ";
            } else {
                asciiValueStr = codedString.substring(i, i + 3);
                asciiValue = Integer.parseInt(asciiValueStr);
                if (asciiValue >= 100 && asciiValue <= 122) {
                    fString += (char) asciiValue;
                    i += 3;
                    continue;
                }
            }
            i += 2;
        }
        System.out.println("Decoded string is:\n" + fString);
        sc.close();
    }
}
