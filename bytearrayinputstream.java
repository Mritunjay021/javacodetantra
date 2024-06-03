import java.io.*;
public class bytearrayinputstream
{
    public static void main(String args[]) throws  Exception
    {
        byte buf[]={71,69,69,75,83};
        ByteArrayInputStream  ba=new ByteArrayInputStream(buf);
        int b=0;
        while((b=ba.read())!=-1)
        {
            char ch=(char)b;
            System.out.println("Char : "+ch);
        }
    }
}