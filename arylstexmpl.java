import java.io.*;
import java.util.*;

class arylstexmpl {
    public static void main(String args[]) {
        int n = 5;
        ArrayList<Integer> ar1 = new ArrayList<Integer>(n);
        ArrayList<Integer> ar2 = new ArrayList<Integer>();
        System.out.println("arr1 : " + ar1);
        System.out.println("arr2 : " + ar2);

        for (int i = 1; i <= n; i++) {
            ar1.add(i);
            ar2.add(i);
        }
        System.out.println("Arr1: " + ar1);
        System.out.println("Arr2: " + ar2);
    }
}