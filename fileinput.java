import java.io.*;
class fileinput
{
    public static void main(String args[])
    {
        FileInputStream file =null;
        try{
            file = new FileInputStream("C:/filehandling/sampletxt1.txt");
            int ch;
            while((ch=file.read())!=-1)
            System.out.println((char)ch);
            file.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}