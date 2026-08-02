import java.io.*;
import java.util.*;

class Combined
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter directory name : ");
        File dir = new File(sobj.nextLine());

        FileOutputStream fos = new FileOutputStream("Combined.bin");

        File files[] = dir.listFiles();

        byte buffer[] = new byte[1024];
        int size;

        for(File f : files)
        {
            if(f.isFile())
            {
                FileInputStream fis = new FileInputStream(f);

                while((size = fis.read(buffer)) != -1)
                {
                    fos.write(buffer,0,size);
                }
                fis.close();
            }
        }

        fos.close();
        System.out.println("Combined.bin created");
    }
}