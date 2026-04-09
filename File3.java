import java.io.*;
import java.util.*;

class File3
{
    public static void main(String A[]) throws Exception
    {
        boolean bRet = false;
        String FileName = null;
        String data = null;
       
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter The Name of file :");
        FileName = sobj.nextLine();

       System.out.println("Enter The data to write into the file :");
       data = sobj.nextLine();

        FileWriter frobj = new FileWriter(FileName);
        BufferedWriter brobj = new BufferedWriter(frobj);
     
        brobj.write(data);
        brobj.newLine();

        brobj.close();
        frobj.close();
        sobj.close();
    }
}