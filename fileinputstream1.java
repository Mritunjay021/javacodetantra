import java.io.*;
public class fileinputstream1
{
    public static void main(String args[])
    {
        FileInputStream inputStream =null;
        byte[] ba=null;
        try{
            inputStream = new FileInputStream("C:/filehandling/sampletxt1.txt");
            int fs=inputStream.available();
            ba= new byte[fs];
            inputStream.read(ba);
            System.out.println("Length is "+ba.length);
        }
        catch(IOException e)
        {
            System.out.println("An error occured  while reading to the file");
        }
    }
}