import java.util.Scanner;

class assertprogram {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter yr age ");
        int val = sc.nextInt();
        assert val >= 18 : "not valid";
        System.out.println("val is " + val);
    }
}