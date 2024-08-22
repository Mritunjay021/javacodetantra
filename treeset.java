import java.util.*;

public class treeset {
    public static void main(String args[]) {
        Set namesSet = new TreeSet();
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        namesSet.add(s1);
        String s2 = sc.nextLine();
        namesSet.add(s2);
        namesSet.add("bak");
        System.out.println("nameset=" + namesSet);
        namesSet.add("xyz");
        System.out.println("nameset=" + namesSet);
        namesSet.remove(s2);
        System.out.println("nameset=" + namesSet);

    }
}