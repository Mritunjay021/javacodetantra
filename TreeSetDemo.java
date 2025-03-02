import java.util.*;

public class TreeSetDemo {
    public static void main(String args[]) {
        Set<String> namesSet = new TreeSet<String>();
        Scanner sc = new Scanner(System.in);
        String str;
        for (int i = 0; i < 3; i++) {
            str = sc.nextLine();
            namesSet.add(str);
        }
        System.out.println("The set of names is: " + namesSet);
        str = sc.nextLine();
        namesSet.add(str);
        System.out.println("nameset=" + namesSet);
        for (int i = 0; i < 2; i++) {
            str = sc.nextLine();
            namesSet.remove(str);
        }
    }
}