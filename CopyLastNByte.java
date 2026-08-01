import java.io.*;
import java.util.*;

class CopyLastNByte
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter file name : ");
        String fname = sobj.nextLine();

        System.out.print("Enter N bytes : ");
        int N = sobj.nextInt();

        File file = new File(fname);
        FileInputStream fis = new FileInputStream(file);

        byte data[] = new byte[(int)file.length()];
        fis.read(data);

        FileOutputStream fos = new FileOutputStream("LastN.txt");

        fos.write(data, data.length - N, N);

        fis.close();
        fos.close();

        System.out.println("Last N bytes copied");
    }
}