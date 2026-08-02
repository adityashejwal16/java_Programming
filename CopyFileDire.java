import java.io.*;
import java.util.*;

class CopyFileDire
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter source directory : ");
        File srcDir = new File(sobj.nextLine());

        System.out.print("Enter destination directory : ");
        File destDir = new File(sobj.nextLine());

        destDir.mkdirs();

        File files[] = srcDir.listFiles();

        for(File f : files)
        {
            if(f.isFile())
            {
                FileInputStream fis = new FileInputStream(f);
                FileOutputStream fos =
                    new FileOutputStream(destDir + "/" + f.getName());

                byte buffer[] = new byte[1024];
                int size;

                while((size = fis.read(buffer)) != -1)
                {
                    fos.write(buffer,0,size);
                }

                fis.close();
                fos.close();
            }
        }
        System.out.println("All files copied");
    }
}