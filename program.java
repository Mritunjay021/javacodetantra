public class Program
{
int a,b;
Program(int a,int b)
{
this.a=a;
this.b=b;
}
Program(int a,int b)
{
System.out.println(a+" "+b);
}
public static void main(String[]args)
{
Program n=new Program(2,3);
}
}
