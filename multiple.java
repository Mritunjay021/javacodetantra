class A extends Thread
{
    A()
    {
        super("user");
    }
    public void run()
    {
        try
        {
            for(int i=1;i<=5;i++)
            {
                System.out.println((Thread.currentThread()).getName()+"thread here.");
                sleep(2000);
            }
        }
        catch(InterruptedException e)
        {}
        System.out.println("second thread  ending..");
    }
}
public class multiple
{   
    public static void main (String args[])
    {
        A ta = new A();
        ta.start();
        try
        {
            for(int i=1;i<=5;i++)
            {
            System.out.println((Thread.currentThread()).getName()+"thread here.");
            Thread.sleep(1000);
            }
        }
        catch(InterruptedException e){}
    }
}