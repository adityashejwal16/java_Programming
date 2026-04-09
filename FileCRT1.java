 import java.io.*;
import java.util.*;

class FileCRT1
{
    public static void main(String A[]) throws Exception
    {
       
        
        String srcFile = null;
        String destFile = null;
       
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter The 1st Name of file :");
        srcFile = sobj.nextLine();

         System.out.println("Enter The destination file :");
        destFile = sobj.nextLine();

        FileInputStream fobj = new FileInputStream(srcFile);
        FileOutputStream foobj = new FileOutputStream(destFile);
        
        int data = 0;
        while((data = fobj.read()) != -1)
        {
           foobj.write(data);
        }
        fobj.close();
        foobj.close();

        System.out.println("Data Succesfully copy into the file :");
        
        sobj.close();
    }
}