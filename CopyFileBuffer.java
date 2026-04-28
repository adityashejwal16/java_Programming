import java.io.*;
import java.util.*;

class CopyUsingBuffer
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

        byte buffer[] = new byte[1024];
        int bytesRead;

        while((bytesRead = fis.read(buffer)) != -1)
        {
            fos.write(buffer,0,bytesRead);
        }

        fis.close();
        fos.close();

        System.out.println("File copied using buffer");
    }
}