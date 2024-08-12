class threadlambdaexp
{
    public static void main(String args[])
    {
        Thread m = new Thread(()->
        {
            for(int i=1;i<=6;i++)
            {
                System.out.println(Thread.currentThread().getName()+"="+i);
            }
        }
        );
        Thread n = new Thread(()->
        {
        for(int i=1;i<=6;i++)
        {
            System.out.println(Thread.currentThread().getName()+"="+i);
        }
        }
        );
        m.start();
        n.start();
    }
}