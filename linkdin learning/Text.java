import java.util.Scanner;

public class Text {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numberOfTests = sc.nextInt();

        for (int i = 0; i < numberOfTests; i++) {
            double total = 0;

            int numberOfScores = sc.nextInt();

            for (int j = 0; j < numberOfScores; j++) {
                double score = sc.nextDouble();
                total += score;
            }

            double average = total / numberOfScores;

            System.out.println("The average score for test " + (i + 1) + " is " + average);
        }

        sc.close();
    }
}