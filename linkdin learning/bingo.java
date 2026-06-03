import java.util.Random;

public class bingo {

    public static void main(String[] args) {
        BingoCard card = Answer.getBingoCard();
        card.printCard();
    }
}

class Answer {

    static boolean showExpectedResult = false;
    static boolean showHints = false;

    static BingoCard getBingoCard() {

        int[] b = generateColumn(1, 15);
        int[] i = generateColumn(16, 30);
        int[] n = generateColumn(31, 45);
        int[] g = generateColumn(46, 60);
        int[] o = generateColumn(61, 75);

        return new BingoCard(b, i, n, g, o);
    }

    private static int[] generateColumn(int min, int max) {

        Random random = new Random();
        int count = 0;
        int[] numbers = new int[5];

        while (count < 5) {
            int number = random.nextInt(max - min + 1) + min;

            if (!elementExists(numbers, number)) {
                numbers[count] = number;
                count++;
            }
        }

        return numbers;
    }

    private static boolean elementExists(int[] array, int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return true;
            }
        }
        return false;
    }
}

class BingoCard {
    private int[] b, i, n, g, o;

    public BingoCard(int[] b, int[] i, int[] n, int[] g, int[] o) {
        this.b = b;
        this.i = i;
        this.n = n;
        this.g = g;
        this.o = o;
    }

    public void printCard() {
        System.out.println(" B  I  N  G  O");

        for (int row = 0; row < 5; row++) {
            System.out.printf("%2d %2d %2d %2d %2d%n",
                    b[row], i[row], n[row], g[row], o[row]);
        }
    }
}