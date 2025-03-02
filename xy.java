interface pq
{
final static int s=10;
public abstract void sub(int x,int y);
public abstract void add(int a,int b);
}
class ab
{
void sub(int x,int y)
{
int z;
z=x-y;
System.out.println("base class"+z);
}
}
class xy extends ab implements pq
{
public void sub(int x,int y)
{
int z;
z=x-y;
System.out.println("derived class"+z);
}
public void add(int a,int b)
{
int c;
c=a+b;
System.out.println(c);
}
public static void main(String args[])
{
xy m=new xy();
m.add(2,2);
m.sub(4,2);
}
}