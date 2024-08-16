class throwsth
{
    void div (int a,int b) throws ArithmeticException
    {
        if (b==0)
        throw new ArithmeticException();
        else
        System.out.println(a/b);
    }
    public static void main(String args[])
    {
        throwsth m = new throwsth();
        try
        {
            m.div(20,0);
        }
        catch(ArithmeticException e)
        {
            System.out.println("value of b is zero");
        }
    }
}