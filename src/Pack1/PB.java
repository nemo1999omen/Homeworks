package Pack1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PB {
    private Map<String, HashSet<String>> map;

    PB() {
        this.map = new HashMap<>();
    }

    void add(String lastName, String phone) {
        HashSet<String> numbers;

        if (map.get(lastName) == null) {
            numbers = new HashSet<>();
        }
        else {
            numbers = map.get(lastName);
        }
        numbers.add(phone);
        map.put(lastName, numbers);

    }

    Set<String> get(String lastName) {

        return map.get(lastName);
    }
}
