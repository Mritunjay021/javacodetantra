public class hi{
public static void main(String[]args){
String s1="xyz";
String s2="xyz";
String s3= new String("xyz");
String s4=new String("xyz");
String s5="forget";
String s6="forgive";
System.out.println(s1==s2);
System.out.println(s1.toUpperCase());
System.out.println(s1==s3);
System.out.println(s1.equals(s2));
System.out.println(s1.equals(s4));
int m=s5.compareTo(s6);
if(m<0)
System.out.println("s5 comes before s6");
else if(m>0)
System.out.println("s6 comes before s5");
else
System.out.println("both are equal");
}
}