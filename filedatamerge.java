import java.io.*;

class merge {
    public static void main(String args[]) throws IOException {
        BufferedReader br1 = null;
        BufferedReader br2 = null;
        PrintWriter pr = null;
        try {
            br1 = new BufferedReader(new FileReader("C:/ko/file1.txt"));
            br2 = new BufferedReader(new FileReader("C:/ko/file2.txt"));
            pr = new PrintWriter(new FileWriter("C:/ko/mritunjay__h.txt"));
            String l1 = " ";
            String l2 = " ";
            while ((l1 = br1.readLine()) != null || (l2 = br2.readLine()) != null) {
                pr.write(l1);
                pr.write(l2);
            }

        } finally {
            if (br1 != null && br2 != null) {
                br1.close();
                br2.close();
            }
            if (pr != null)
                pr.close();
        }
    }
}