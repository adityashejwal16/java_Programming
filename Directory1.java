import java.io.*;
import java.util.*;

class Directory1
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        String dirF = null;

        System.out.println("Enter Directory Name : ");
        dirF = sobj.nextLine();

        File dirD = new File(dirF);

        if((dirD.exists()) && (dirD.isDirectory()))
        {
            System.out.println("Directory is present");

            File fArr[] = dirD.listFiles();

            System.out.println("Number of files in the folder are : "+fArr.length);
        }
        else
        {
            System.out.println("there is no directory");
        }
        
         sobj.close();
    }
}