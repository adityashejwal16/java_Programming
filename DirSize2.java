import java.io.*;
import java.util.*;

class DirSize2
{
    public static void main(String A[]) 
    {
        String Dir = null;
        int iCnt = 0;
        long max = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter The Directory Name :");
        Dir = sobj.nextLine();

        File dobj = new File(Dir);

        if(dobj.exists() &&dobj.isDirectory())
        {
            File files[] = dobj.listFiles();
            
            for(int i =0; i <files.length; i++)
            {
               if(files[i].isFile())
               {
                if(files[i].length() > max)
                {
                    max = files[i].length();
                }
               
               }
            }
             System.out.println("Largest File Size : "+ max);
            
        }
        else
        {
            System.out.println("Is not Sub-Directory");
        }

        sobj.close();
    }
}