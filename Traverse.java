import java.util.*;

public class Traverse {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("abc", 10);
        map.put("xyz", 2);
        map.put("pqr", 20);
        for (Map.Entry<String, Integer> e : map.entrySet())
            System.out.println("key" + e.getKey() + " value: " + e.getValue());
    }
}