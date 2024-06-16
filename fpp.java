import java.util.*;
public class fpp
{
enum Days
{
MON,TUE,WED,THR,FRI,SAT,SUN;
}
public static void main(String args[])
{
for(Days d:Days.values())
{
System.out.println(d);
}
Scanner sc = new Scanner (System.in);
System.out.println("input");
String ss = sc.nextLine();
Days m= Days.valueOf(ss);
switch(m)
{
case MON: System.out.println("MONDAY");
break;
case TUE:System.out.println("TUESDAY");
break;
default:System.out.println("INVALID CHOICE");
}
}
}