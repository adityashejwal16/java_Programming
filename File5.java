import java.io.*;
import java.util.*;

class File5
{
    public static void main(String A[]) throws Exception
    {
        String FileName = null;
        int i = 0;
      
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter The Name of Directory :");
        String dirName = sobj.nextLine();

        File dobj = new File(dirName);

        if(dobj.exists() && dobj.isDirectory())
        {
            String fileList[] = dobj.list();

            System.out.println("Files in directory are :");

            for(i = 0; i< fileList.length; i++)
            {
                System.out.println(fileList[i]);
            } 
        }
        else
        {
            System.out.println("Directory does not exist or is not a directory.");
        }

        
        sobj.close();
    }
}