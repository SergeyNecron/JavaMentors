package Collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList(s.split(" ")));

        for (int i = 0; i < list.size(); i++) {
            list.remove(i);
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }
}
