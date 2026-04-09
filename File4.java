import java.io.*;
import java.util.*;

class File4
{
    public static void main(String A[]) throws Exception
    {
        boolean bRet = false;
        String FileName = null;
        String data = null;
       
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter The Name of file :");
        FileName = sobj.nextLine();

        File fobj = new File(FileName);

        if(fobj.exists())
        {
            System.out.println("File Already Exists ");
        }
        else
        {
            fobj.createNewFile();
            System.out.println("New File Created succesfully");
        }
        
        sobj.close();
    }
}