import java.io.*;
import java.util.*;

class SplitFile
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter file name : ");
        String fname = sobj.nextLine();

        File file = new File(fname);
        FileInputStream fis = new FileInputStream(file);

        byte data[] = new byte[(int)file.length()];
        fis.read(data);

        int half = data.length / 2;

        FileOutputStream fos1 = new FileOutputStream("FirstHalf.txt");
        FileOutputStream fos2 = new FileOutputStream("SecondHalf.txt");

        fos1.write(data,0,half);
        fos2.write(data,half,data.length-half);

        fis.close();
        fos1.close();
        fos2.close();

        System.out.println("File splitted successfully");
    }
}