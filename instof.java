class abc
{
void show()
{
System.out.println("base class");
}
}
class instof extends abc
{
void display()
{
System.out.println("base class");
}
public static void main(String args[])
{
abc x=new abc();
instof m=new instof();
System.out.println(m instanceof instof);
System.out.println(x instanceof abc);
System.out.println(m instanceof abc);
System.out.println(x instanceof instof);
m.show();
m.display();
}
}
