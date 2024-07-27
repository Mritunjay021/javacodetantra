import java.io.*;
public class merge
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br1 = null;
        BufferedReader br2 = null;
        PrintWriter pr= null;
        try
        {
            br1= new BufferedReader (new FileReader("C:/filehandling/sampletxt1.txt"));
            br2= new BufferedReader (new FileReader("C:/filehandling/sampletxt2.txt"));
            pr= new PrintWriter (new FileWriter("C:/filehandling/sampletxt3.txt"));
            String l;
            while((l=br1.readLine())!=null)
            {
                pr.write(l);
            }
            while((l=br2.readLine())!=null)
            {
                pr.write(l);
            }
        }
        finally
        {
            if(br1 != null && br2!=null)
            {
                br1.close();
                br2.close();
            }
            if(pr != null)
            pr.close();
        }
    }
}