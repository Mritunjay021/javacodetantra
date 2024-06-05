import java.io.*;
public class Copy
{
    public static void main (String args[]) throws IOException
    {
        FileReader inputStream = null;
        FileWriter outputStream = null;
        try{
            inputStream = new FileReader("C:/filehandling/sampletxt1.txt");
            outputStream = new FileWriter("C:/filehandling/sampletxt1.txt");
            int c;
            while((c=inputStream.read())!=-1)
            {
                outputStream.write(c);
            }
        }
        finally
        {
            if(inputStream != null)
            inputStream.close();
            if(outputStream != null)
            outputStream.close();
        }
    }
}