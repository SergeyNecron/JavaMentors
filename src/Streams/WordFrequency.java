package Streams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordFrequency {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStream = new InputStreamReader(System.in, "UTF-8");
        BufferedReader reader = new BufferedReader(inputStream);

        reader
                .lines()
                .map(x -> x.toLowerCase())
                .map(x -> x.split("[\\p{Punct}\\s]+"))
                //    .map(x -> x.split("[^а-яa-z1-9]+"))
                .flatMap(x -> Arrays.stream(x))
                // .collect(Collectors.toMap(a->a,b->b==null?(Integer)1:(Integer)(Integer.valueOf(b)+1)))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .map(Map.Entry::getKey)
                .limit(10)
                .forEach(System.out::println);
    }
}

/*        String s;
        //   s = reader.readLine();
    //   s = "Мама мыла-мыла-мыла раму!";
        s = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed sodales consectetur purus at faucibus. Donec mi quam, tempor vel ipsum non, faucibus suscipit massa. Morbi lacinia velit blandit tincidunt efficitur. Vestibulum eget metus imperdiet sapien laoreet faucibus. Nunc eget vehicula mauris, ac auctor lorem. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer vel odio nec mi tempor dignissim.;\n";
       // String[] masString = s.toLowerCase().split("[\\s.,!@#$%^&*()-_+\"№;:]+");
        String[] masString = s.toLowerCase().split("[^а-яa-z1-9]+");
        HashMap<String,Integer> map = new HashMap();
        for (String key: masString) {
            Integer value = map.get(key);
            map.merge(key,value==null?1:value,(a,b)->++b);
        }
        String[] result = new String[10];
        ArrayList list = new ArrayList();
        map.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .limit(10)
                .forEach(System.out::println);
             //        .forEach(list.add());
        System.out.println("end");*/
