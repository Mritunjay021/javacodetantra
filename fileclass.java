import java.io.*;
public class fileclass
{
    public static void main(String args[])
    {
        String data= "append.file";
        File file = new File("C:/filehandling/sampletxt1.txt");
        try{
            FileWriter fw = new FileWriter(file,true);
            fw.write(data);
            fw.close();
            System.out.println("Data appended to the file.");
        }
        catch(IOException e)
        {
            System.out.println("An error occured  while appending to the file");
        }
    }
}