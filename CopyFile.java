import java.io.*;
import java.util.*;

class CopyFile
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter source file : ");
        String src = sobj.nextLine();

        System.out.print("Enter destination file : ");
        String dest = sobj.nextLine();

        FileInputStream fis = new FileInputStream(src);
        FileOutputStream fos = new FileOutputStream(dest);

        int data;
        while((data = fis.read()) != -1)
        {
            fos.write(data);
        }

        fis.close();
        fos.close();

        System.out.println("File copied successfully");
    }
}