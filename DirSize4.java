// Write a program in Java which accepts a directory name and file extension from user and display only files 
// having that extension.
import java.io.*;
import java.util.*;

class DirSize4
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
            
            for(int i =0; i < files.length; i++)
            {
               if(files[i].isFile())
               {
                if(files[i].getName().endsWith(".txt"))
                {
                    System.out.println(files[i].getName()+ " - " + files[i].length() + "Bytes");
                }
               
               }
            }
            
        }
        else
        {
            System.out.println("Is not Directory");
        }

        sobj.close();
    }
}