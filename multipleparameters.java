import java.util.Scanner;

class genrics<T, S> {
    T t;
    S s;

    public void add(T t, S s) {
        this.t = t;
        this.s = s;
    }

    public T getFirstargs() {

        return t;
    }

    public S getSecondargs() {

        return s;
    }
}

public class multipleparameters {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String l = sc.next();
        genrics<Integer, String> obj1 = new genrics<Integer, String>();
        obj1.add(n, l);
        System.out.printf("%d \n", obj1.getFirstargs());
        System.out.printf(obj1.getSecondargs());
    }
}