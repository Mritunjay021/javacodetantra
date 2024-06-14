import java.io.*;
class fileoutput
{
    public static void main(String args[])
    {
        FileOutputStream file =null;
        byte b[]={'x','y','z'};
        try{
            file = new FileOutputStream("C:/filehandling/sampletxt1.txt");
            file.write(b);
            file.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}