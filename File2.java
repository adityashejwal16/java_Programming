import java.io.*;
import java.util.*;

class File2
{
    public static void main(String A[]) throws IOException
    {
        String FileName = null;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter The File Name :");
        FileName = sobj.nextLine();

        File fobj = new File(FileName); // Create File

        boolean bRet = fobj.createNewFile();

        if(bRet == true)
        {
            System.err.println("File Gets Created Successfully");
        }
        else
        {
            System.err.println("Unable To Create File");
        }

        sobj.close();
    }
}