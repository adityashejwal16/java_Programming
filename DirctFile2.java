import java.io.*;
import java.util.*;

class DirectFile2
{
    public static void main(String A[]) 
    {
        String Dir = null;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter The Directory Name :");
        Dir = sobj.nextLine();

        File dobj = new File(Dir);

        if(dobj.exists() && dobj.isDirectory())
        {
            File files[] = dobj.listFiles();
           System.out.println("is Regular file :");

           for(int i = 0; i < files.length; i++)
           {
             if(files[i].isFile())    // regular file is it 
             {
                System.out.println(files[i].getName());
             }
           }
        }
        else
        {
            System.out.println("There Is no Directory :");
        }

        sobj.close();
    }
}