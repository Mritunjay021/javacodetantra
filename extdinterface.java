interface A{
void methodA();
}
interface B{
void methodB();
}
interface C extends A,B{
void methodC();
}
class D implements C{
public void methodA(){
System.out.println("Implemetation of methodA");
}
public void methodB(){
System.out.println("Implementation of methodB");
}
public void methodC(){
System.out.println("Implementation of methodC");
}
}
public class extdinterface{
public static void main(String[]args){
D obj=new D();
obj.methodA();
obj.methodB();
obj.methodC();
}
}