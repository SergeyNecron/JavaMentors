package Collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Напишите программу, которая прочитает из System.in последовательность целых чисел, разделенных пробелами,
  затем удалит из них все числа, стоящие на четных позициях, и затем выведет получившуюся последовательность в обратном порядке в System.out.

  Все числа влезают в int. Позиции чисел в последовательности нумеруются с нуля.
  В этом задании надо написать программу целиком, включая import'ы, декларацию класса Main и метода main.

        Sample Input:
        1 2 3 4 5 6 7

        Sample Output:
        6 4 2*/

public class Main {

    public static void main(String[] args) throws IOException {
        String s;
        s = new BufferedReader(new InputStreamReader(System.in)).readLine();
        StringBuilder reader = new StringBuilder();
        if (s != null) {
            String[] mass = s.split(" ");
            for (int i = mass.length - (mass.length % 2 == 0 ? 1 : 2); i >= 0; i -= 2) {
                reader.append(mass[i]);
                reader.append(" ");
            }
        }
        System.out.println(reader.toString());
    }
}