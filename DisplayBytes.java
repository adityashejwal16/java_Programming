import java.io.*;
import java.util.*;

class DisplayByte
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter file name : ");
        String fname = sobj.nextLine();

        FileInputStream fis = new FileInputStream(fname);

        int count = 0;
        while(fis.read() != -1)
        {
            count++;
        }

        fis.close();

        System.out.println("Total bytes : "+count);
    }
}