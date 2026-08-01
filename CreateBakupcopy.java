import java.io.*;
import java.util.*;

class CreateBakupcopy
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter file name : ");
        String fname = sobj.nextLine();

        int dotIndex = fname.lastIndexOf('.');
        String backupName =
            fname.substring(0,dotIndex) + "_backup" +
            fname.substring(dotIndex);

        FileInputStream fis = new FileInputStream(fname);
        FileOutputStream fos = new FileOutputStream(backupName);

        byte buffer[] = new byte[1024];
        int size;

        while((size = fis.read(buffer)) != -1)
        {
            fos.write(buffer,0,size);
        }

        fis.close();
        fos.close();

        System.out.println("Backup created : "+backupName);
    }
}