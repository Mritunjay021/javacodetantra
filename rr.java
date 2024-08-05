class r implements Runnable
{
    Thread t;;
    r()
    {
        t= new Thread(this,"second");
        System.out.println("sec thread runinng..");
        t.start();
    }
    public void run()
    {
        try
        {
            for(int i=1;i<=3;i++)
            {
                System.out.println((Thread.currentThread()).getName()+"thread here.") ;
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e){}
        System.out.println("second thread ending..");
    }
}
class rr
{
    public static void main (String args[])
    {
        r ta = new r();
        try
        {
            for(int i=1;i<=3;i++)
            {
                System.out.println((Thread.currentThread()).getName()+"thread here.");
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e){}
    }
}