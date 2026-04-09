import java.io.*;
import java.util.*;

class FileCRT5
{
    public static void main(String A[]) throws Exception
    {
            Scanner sobj = new Scanner(System.in);

            String dirN = null;
            byte Buffer[] = new byte[1024];
            int bytesRead = 0;

            System.out.println("Enter directory name :");
            dirN = sobj.nextLine();

           File dir = new File(dirN);

           if(dir.exists() && dir.isDirectory())
           {
             File files[] = dir.listFiles();

             System.out.println("\nFile Name\t\tSize (bytes)");
             System.out.println("--");

             for(File f : files)
             {
                if(f.isFile());
                {
                    System.out.println(f.getName() + "\t" + f.length());
                }
             }
           }
           else
           {
             System.out.println("Directory does not exist");
           }
    }
}
