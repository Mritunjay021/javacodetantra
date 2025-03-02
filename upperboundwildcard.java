import java.util.Arrays;
import java.util.List;

public class upperboundwildcard {
    public static <T extends Number> T add(List<? extends T> list) {
        double sum = 0.0;
        for (T item : list)
            sum += item.doubleValue();
        if (list.get(0) instanceof Integer)
            return (T) Integer.valueOf((int) sum);
        else if (list.get(0) instanceof Double)
            return (T) Double.valueOf(sum);
        else
            throw new IllegalArgumentException("Unsupported number type");
    }

    public static void main(String args[]) {
        List<Integer> integersList = Arrays.asList(1, 2, 3);
        Integer intSum = add(integersList);
        System.out.println("sum of int: " + intSum);

        List<Double> doubleList = Arrays.asList(1.2, 2.6, 3.8);
        Double doubleSum = add(doubleList);
        System.out.println("sum of doubles: " + doubleSum);
    }
}