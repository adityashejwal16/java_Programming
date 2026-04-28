import java.io.*;
import java.util.*;

class MergeTwoFile
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter first file : ");
        String file1 = sobj.nextLine();

        System.out.print("Enter second file : ");
        String file2 = sobj.nextLine();

        System.out.print("Enter output file : ");
        String out = sobj.nextLine();

        FileOutputStream fos = new FileOutputStream(out);

        FileInputStream fis1 = new FileInputStream(file1);
        FileInputStream fis2 = new FileInputStream(file2);

        byte buffer[] = new byte[1024];
        int size;

        while((size = fis1.read(buffer)) != -1)
        {
            fos.write(buffer,0,size);
        }

        while((size = fis2.read(buffer)) != -1)
        {
            fos.write(buffer,0,size);
        }

        fis1.close();
        fis2.close();
        fos.close();

        System.out.println("Files merged successfully");
    }
}