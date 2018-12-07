package Collections;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws IOException {
        //     String s = new BufferedReader(new InputStreamReader(System.in)).readLine();
        //TEST
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            StringBuilder reader = new StringBuilder();
            int nextInt = random.nextInt(10);
            for (int j = 0; j < nextInt; j++) {
                reader.append(random.nextInt(100));
                reader.append(" ");
            }
            System.out.printf("чисел в строке: %d \nстрока: %s \n", nextInt, reader.toString());
            System.out.printf("результат %s \n -----------------\n", chetnue(reader.toString()));
            System.out.printf("результат %s \n -----------------\n", chetnueArray(reader.toString()));
        }
    }

    private static StringBuilder chetnueArray(String s) {
        StringBuilder reader = new StringBuilder();
        if (s != null) {
            ArrayList<String> list = new ArrayList<>();
            list.addAll(Arrays.asList(s.split(" ")));

            for (int i = list.size() - 1; i > 0; i--) {
                list.remove(i);
                reader.append(list.get(--i));
                reader.append(" ");
            }
        }
        return reader;
    }

    private static StringBuilder chetnue(String s) {
        StringBuilder reader = new StringBuilder();
        if (s != null) {
            String[] mass = s.split(" ");
            for (int i = mass.length - 2; i >= 0; i -= 2) {
                reader.append(mass[i]);
                reader.append(" ");
            }
        }
        return reader;
    }

}
   /* чисел в строке: 8
        строка: 80 51 63 30 88 41 31 81
        результат 31 88 63 80
        -----------------
        результат 31 88 63 80
        -----------------
        чисел в строке: 3
        строка: 63 58 11
        результат 58
        -----------------
        результат 58
        -----------------
        чисел в строке: 0
        строка:
        результат
        -----------------
        результат
        -----------------
        чисел в строке: 8
        строка: 97 18 64 30 47 64 97 52
        результат 97 47 64 97
        -----------------
        результат 97 47 64 97
        -----------------
        чисел в строке: 3
        строка: 43 82 69
        результат 82
        -----------------
        результат 82
        -----------------
        чисел в строке: 4
        строка: 55 91 89 99
        результат 89 55
        -----------------
        результат 89 55
        -----------------
        чисел в строке: 1
        строка: 85
        результат
        -----------------
        результат
        -----------------
        чисел в строке: 0
        строка:
        результат
        -----------------
        результат
        -----------------
        чисел в строке: 2
        строка: 41 18
        результат 41
        -----------------
        результат 41
        -----------------
        чисел в строке: 5
        строка: 66 23 42 95 11
        результат 95 23
        -----------------
        результат 95 23
        -----------------
*/
//    if (s != null) {
//            StringBuilder result = new StringBuilder();
//            int i = 0;
//            for (char ch : s.toCharArray()) {
//            if (ch != ' ') {
//            i++;
//            if (i % 2 == 0) {
//            result.append(ch);
//            result.append(' ');
//            }
//            }
//            }
//            System.out.println(result.reverse().toString().trim());
//            }