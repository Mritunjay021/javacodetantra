public class hy{
public static void main(String[]args){
StringBuilder s= new StringBuilder("abcd");
System.out.println(s.append("xyz"));
System.out.println(s.insert(1,"java"));
System.out.println(s.replace(0,2,"hello"));
System.out.println(s.reverse());
System.out.println(s.length());
}
}