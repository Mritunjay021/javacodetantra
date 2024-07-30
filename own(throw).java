class MyException extends Exception
{
    public MyException(int i)
    {
        System.out.println("you"+i+"entered exceeding the limit");
    }
}
public class own
{
    public void show(int i)throws MyException
    {
        if(i>100)
        throw new MyException(i);
        else
        System.out.println(+i+"is less than 100 its ok");
    }
    public static void main(String args[])
    {
        int i=Integer.parseInt(args[0]);
        int j=Integer.parseInt(args[1]);
        own t = new own();
        try
        {
            t.show(i);
            t.show(j);
        }
        catch (MyException e)
        {
            System.out.println("catched exception is"+e);
        }
    }
}