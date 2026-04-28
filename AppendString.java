import java.io.*;
import java.util.*;

class AppendString
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter file name : ");
        String fname = sobj.nextLine();

        System.out.print("Enter string : ");
        String data = sobj.nextLine();

        FileOutputStream fos = new FileOutputStream(fname,true);

        byte arr[] = data.getBytes();
        fos.write(arr);

        fos.close();

        System.out.println("Data appended successfully");
    }
}