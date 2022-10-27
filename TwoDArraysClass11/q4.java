import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of participants: ");
        int n = sc.nextInt();
        char arr[][] = new char[n][5];
        char key[] = new char[5];
        int score[] = new int[n];
        System.out.println("Enter the correct answer key: ");
        for (int i = 0; i < key.length; i++) {
            key[i] = Character.toLowerCase(sc.next().charAt(0));
        }
        System.out.println("Enter Scores");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Participant " + (i + 1));
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = Character.toLowerCase(sc.next().charAt(0));
                if (arr[i][j] == key[j]) {
                    score[i] += 1;
                }
            }
        }
        int max_index = 0;
        int max_score = 0;
        for (int i = 0; i < score.length; i++) {
            System.out.println("Participant " + (i + 1) + " : " + score[i]);
            if (score[i] > max_score) {
                max_index = i;
                max_score = score[i];
            }
        }
        System.out.println("Max score: " + "Participant " + (max_index + 1));

        sc.close();
    }
}
