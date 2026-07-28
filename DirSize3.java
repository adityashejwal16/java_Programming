import java.io.*;
import java.util.*;

class DirSize3
{
    public static void main(String A[]) 
    {
        String Dir = null;
        int iCnt = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter The Directory Name :");
        Dir = sobj.nextLine();

        File dobj = new File(Dir);

        if(dobj.exists() &&dobj.isDirectory())
        {
            File files[] = dobj.listFiles();
            long small = Long.MAX_VALUE;
            
            for(int i =0; i < files.length; i++)
            {
               if(files[i].isFile())
               {
                if(files[i].length() < small)
                {
                    small = files[i].length();
                }
               
               }
            }
             System.out.println("Small File Size : "+ small);
            
        }
        else
        {
            System.out.println("Is not Sub-Directory");
        }

        sobj.close();
    }
}