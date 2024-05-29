import java.util.*;
import java.io.*;

class arraylistexample1 {
    public static void main(String args[]) {
        ArrayList<Object> arr1 = new ArrayList<Object>();
        arr1.add(0, 10);
        arr1.add(1, 'b');
        arr1.add(2, 40);
        arr1.add(3, 20);
        arr1.add(2, "hello");
        System.out.println("arraylist: " + arr1);
    }
}