import java.util.*;
public class FP
{
void show(String s,int...a)
{
System.out.println(s);
for (int p:a)
{
System.out.println(p);
}
System.out.println();
}
public static void main(String []args)
{
FP m=new FP();
m.show("xyz",2);
m.show("pqr",2,4,5);
}
}