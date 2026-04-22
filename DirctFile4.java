import java.io.*;
import java.util.*;

class DirectFile4
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
            
            for(int i =0; i <files.length; i++)
            {
               if(files[i].isFile())
               {
                iCnt++;
               }
            }
            System.out.println("Number Of total Files are :" +iCnt);
        }
        else
        {
            System.out.println("Is not Sub-Directory");
        }

        sobj.close();
    }
}