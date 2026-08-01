import java.io.*;
import java.util.*;

class FileException
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        try
        {
            System.out.print("Enter file name : ");
            String fname = sobj.nextLine();

            FileInputStream fis = new FileInputStream(fname);

            int count = 0;
            while(fis.read() != -1)
            {
                count++;
            }

            fis.close();

            System.out.println("Total bytes : "+count);
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not found");
        }
        catch(IOException e)
        {
            System.out.println("Input Output error");
        }
        catch(Exception e)
        {
            System.out.println("Unknown error occurred");
        }
    }
}