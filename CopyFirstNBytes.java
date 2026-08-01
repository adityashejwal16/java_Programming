import java.io.*;
import java.util.*;

class CopyFirstNBytes
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter file name : ");
        String fname = sobj.nextLine();

        System.out.print("Enter N bytes : ");
        int N = sobj.nextInt();

        FileInputStream fis = new FileInputStream(fname);
        FileOutputStream fos = new FileOutputStream("FirstN.txt");

        for(int i=0;i<N;i++)
        {
            int data = fis.read();
            if(data == -1) break;
            fos.write(data);
        }

        fis.close();
        fos.close();

        System.out.println("First N bytes copied");
    }
}