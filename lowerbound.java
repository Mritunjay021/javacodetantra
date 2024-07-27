import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lowerbound {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(15);
        integers.add(20);
        integers.add(35);

        List<Number> numbers = new ArrayList<>();
        numbers.add(45.0);
        numbers.add(23.0);
        numbers.add(18.0);

        addIntegers(integers, numbers);
        System.out.println("After adding integers" + numbers);
    }

    public static void addIntegers(List<? extends Integer> a, List<? super Integer> b) {
        for (Integer i : a)
            b.add(i);
    }
}