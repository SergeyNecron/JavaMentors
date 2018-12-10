package Collections;

import java.util.Random;

import static Collections.Sequence_6_2.numbers;

public class Sequence_6_2Test {
    public static void main(String[] args) {
        String s;
        //        s = new BufferedReader(new InputStreamReader(System.in)).readLine();

        int seed = 3;
        final int maxCount = 10;
        final int maxNumber = 100;

        for (int i = 0; i < 10; i++) {
            if (i == 0) s = "1 2 3 4 5 6 7";
            else s = getNextString(maxCount, maxNumber, seed + i);

            System.out.printf("тестируемая строка %s \n", s);
            System.out.printf("результат %s \n -----------------\n", numbers(s, 1));
            System.out.printf("результат %s \n -----------------\n", numbers(s, 2));
            System.out.printf("результат %s \n -----------------\n", numbers(s, 3));
            System.out.printf("результат реверс%s \n -----------------\n", numbers(s, 4));
        }
    }

    private static String getNextString(final int maxCount, final int maxNumber, final int seed) {
        StringBuilder reader = new StringBuilder();
        Random random = new Random(seed);
        final int count = random.nextInt(maxCount);
        for (int j = 0; j < count; j++) {
            int number = random.nextInt(maxNumber);
            reader.append(number);
            reader.append(" ");
        }
        return reader.toString();
    }
}
