import java.io.*;
import java.util.*;

class File1
{
    public static void main(String A[]) throws IOException
    {
        Scanner sobj = new Scanner(System.in);

        File fobj = new File("Addi.txt"); // Create File

        boolean bRet = fobj.createNewFile();

        if(bRet == true)
        {
            System.err.println("File Gets Created Successfully");
        }
        else
        {
            System.err.println("Unable To Create File");
        }
    }
}