 import java.io.*;
import java.util.*;

class FileCRT3
{
    public static void main(String A[]) throws Exception
    {
       
        Scanner sobj = new Scanner(System.in);
        String dirD = null;

        System.out.println("Enter The Name of file :");
        dirD = sobj.nextLine();

        File dir = new File(dirD);

        if(dir.exists())
        {
            System.out.println("Directory Already exists");
        }
        else
        {

            if(dir.mkdir())
            {
                System.out.println("Directory created successfully");
            }
             else
            {
                System.out.println("Failed to create directory");
            }

        }  
         
        sobj.close();
    }
}