import java.util.Scanner;

public class GenericMethodExample {
    public static <T> void printArray(T[] array) {
        for (T elements : array)
            System.out.println(elements);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] ar1 = new Integer[n];
        String[] ar2 = new String[n];

        for (int i = 0; i < n; i++) {
            ar1[i] = sc.nextInt();
            ar2[i] = sc.next();
        }

        System.out.println("int ar is : ");
        printArray(ar1);

        System.out.println("str ar is : ");
        printArray(ar2);
    }
}
