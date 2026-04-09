 import java.io.*;
import java.util.*;

class FileCRT2
{
    public static void main(String A[]) throws Exception
    {
        String fFile = null;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter The Name of file :");
        fFile = sobj.nextLine();

        File fobj = new File(fFile);

        if(fobj.isFile())
        {
            System.out.println("File is regular");
        }
        else
        {
            System.out.println("File Is not regular");
        }
         
        sobj.close();
    }
}