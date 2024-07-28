import java.util.*;
public class month{
public static void main(String[]args){
Scanner scanner=new Scanner(System.in);
System.out.println("Enter month");
int month=scanner.nextInt();
System.out.println("Enter day");
int day=scanner.nextInt();
switch(month){
case 1:
if(day<=19)
System.out.println("Cap");
else
System.out.println("aqua");
break;
case 2:
if(day<=18)
System.out.println("aqua");
else
System.out.println("pices");
break;
case 3:
if(day<=20)
System.out.println("pices");
else
System.out.println("aries");
break;
case 4:
if(day<=19)
System.out.println("aries");
else
System.out.println("tauras");
break;
case 5:
if(day<=20)
System.out.println("tauras");
else
System.out.println("gem");
break;
case 6:
if(day<=20)
System.out.println("gem");
else
System.out.println("can");
break;
case 7:
if(day<=22)
System.out.println("can");
else
System.out.println("leo");
break;
case 8:
if(day<=22)
System.out.println("leo");
else
System.out.println("vig");
break;
case 9:
if(day<=22)
System.out.println("vig");
else
System.out.println("lib");
break;
case 10:
if(day<=22)
System.out.println("lib");
else
System.out.println("sco");
break;
case 11:
if(day<=21)
System.out.println("sco");
else
System.out.println("sag");
break;
case 12:
if(day<=21)
System.out.println("sag");
else
System.out.println("cap");
}
}
}
