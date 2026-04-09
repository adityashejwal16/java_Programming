import java.io.*;
import java.util.*;

class File2
{
    public static void main(String A[]) throws Exception
    {
        boolean bRet = false;
        String FileName = null;
       
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter The Name of file");
        FileName = sobj.nextLine();

        File fobj = new File(FileName);

        FileReader frobj = new FileReader(FileName);
        BufferedReader brobj = new BufferedReader(frobj);

        String Line = null;

        System.out.println("File Contain Are : ");

        while((Line = brobj.readLine()) != null)
        {
            System.out.println(Line);
        }

        frobj.close();
    
        sobj.close();
    }
}