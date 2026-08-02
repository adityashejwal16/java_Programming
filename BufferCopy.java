import java.io.*;
import java.util.*;

class BuffereCopy
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter source file : ");
        String src = sobj.nextLine();

        System.out.print("Enter destination file : ");
        String dest = sobj.nextLine();

        BufferedInputStream bis =
            new BufferedInputStream(new FileInputStream(src));

        BufferedOutputStream bos =
            new BufferedOutputStream(new FileOutputStream(dest));

        byte buffer[] = new byte[1024];
        int size;

        while((size = bis.read(buffer)) != -1)
        {
            bos.write(buffer,0,size);
        }

        bis.close();
        bos.close();

        System.out.println("File copied using buffered streams");
    }
}