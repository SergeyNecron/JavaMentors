package Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class Sequence_6_2 {

    static String numbers(String s, int variant) {
        StringBuilder reader = new StringBuilder();
        if (s != null) {
            String[] mass = s.split(" ");

            switch (variant) {
                case 1: {
                    numbersListOneCycle(mass, reader);
                    break;
                }
                case 2: {
                    numbersListTwoCycle(mass, reader);
                    break;
                }
                case 3: {
                    numbersMass(mass, reader);
                    break;
                }
                case 4: {
                    numbersMassReverse(mass, reader);
                    break;
                }
            }
        }
        return reader.toString();
    }

    private static void numbersListOneCycle(String[] mass, StringBuilder reader) {
        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList(mass));
        for (int i = list.size() - 1; i > 0; i--) {
            list.remove(i);
            reader.append(list.get(--i));
            reader.append(" ");
        }
    }

    private static void numbersListTwoCycle(String[] mass, StringBuilder reader) {
        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList(mass));

        for (int i = 0; i < list.size(); i++) {
            list.remove(i);
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            reader.append(list.get(i));
            reader.append(" ");
        }
    }

    private static void numbersMass(String[] mass, StringBuilder reader) {
        for (int i = mass.length - (mass.length % 2 == 0 ? 1 : 2); i >= 0; i -= 2) {
            reader.append(mass[i]);
            reader.append(" ");
        }
    }

    private static void numbersMassReverse(String[] mass, StringBuilder reader) {
        for (int i = 1; i < mass.length; i += 2) {
            reader.append(mass[i]);
            reader.append(" ");
        }
        reader.reverse();
    }
}
