import java.io.*;
public class printwriter
{
    public static void main (String args[]) throws IOException
    {
        BufferedReader br = null;
        PrintWriter pr = null;
        try
        {
            br= new BufferedReader (new FileReader("C:/filehandling/sampletxt1.txt"));
            pr= new PrintWriter (new FileWriter("C:/filehandling/sampletxt1.txt"));
            String l;
            while((l=br.readLine())!=null)
            {
                pr.write(l);
            }
        }
        finally
        {
            if(br != null)
            br.close();
            if(pr != null)
            pr.close();
        }
    }
}