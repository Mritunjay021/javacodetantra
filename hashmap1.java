import java.util.HashMap;

public class hashmap1 {
    public static void main(String args[]) {
        HashMap<Integer, String> obj = new HashMap<Integer, String>();
        System.out.println("Size of the map is: " + obj.size());
        obj.put(101, "abc");
        obj.put(102, "def");
        obj.put(103, "ghi");
        obj.put(104, "jkl");
        obj.put(105, "mno");
        System.out.println("size is" + obj.size());
        System.out.println(obj.get(103));
        System.out.println("After removing:=" + obj.remove(105));
        System.out.println(obj);
        System.out.println("Print keyset");
        for (Integer i : obj.keySet()) {
            System.out.println("Keysetis:" + i);
        }
        for (String s : obj.values())
            System.out.println("Values is: " + s);
        System.out.println("both keyste and values:");
        for (Integer i : obj.keySet())
            System.out.println("key: " + i + "value: " + obj.get(i));
        HashMap<Integer, String> obj1 = new HashMap<Integer, String>();
        obj1.put(111, "Eleven");
        obj1.put(222, "twelve");
        obj1.putAll(obj);
        System.out.println("After adding all:=" + obj1);
    }
}