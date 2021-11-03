package Pack1;

import java.util.*;

public class HW4 {
    public static void main (String[] args){
        String[] words = {"passat", "golf", "touran", "golf", "polo", "tiguan", "polo", "toureg", "golf", "teramont"};
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            if(map.get(word) == null){
                map.put(word, 1);
            }
            else{
                map.put(word, map.get(word) + 1);
            }
            //map.merge(word, 1, Integer::sum);  <-- компилятор подсказывает, что можно еще и так
        }
        System.out.println(map);
        System.out.println("");
        Set<String> uniq = new HashSet<>(Arrays.asList(words));
        System.out.println(uniq);
        System.out.println("");

        PB pb = new PB();

        pb.add("Nemo", "3254");
        pb.add("Omen", "6886");
        pb.add("Omen", "65856");
        pb.add("Noman", "235235");

        System.out.println(pb.get("Omen"));
    }
}
