abstract class abc
{
    abstract void show();
}
class program1
{
    public static void main(String args[])
    {
        abc m =new abc()
        {
            public void show()
            {
                System.out.println("show func!");
            }
        };
        m.show();
    }
}

