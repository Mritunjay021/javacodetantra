class outer
{
    static int a=10;
    static int b=20;
    static private int c =30;
    static class inner
    {
        void sum()
        {
            int d;
            d=a+b+c;
            System.out.prinltln(d);
        }
    }
    public static void main(String args[])
    {
        //outer m = new outer();
        outer.inner s=new outer.inner();
        n.sum();
    }
}
