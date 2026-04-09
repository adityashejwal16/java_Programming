import java.io.*;
import java.security.MessageDigest;
import java.util.*;

class FileCRT3
{
    public static void main(String A[]) throws Exception
    {
            Scanner sobj = new Scanner(System.in);
            String fileN = null;
            byte Buffer[] = new byte[1024];
            int bytesRead = 0;

            System.out.println("Enter the name of file:");
            fileN = sobj.nextLine();

            FileInputStream fioj = new FileInputStream(fileN);

            MessageDigest md = MessageDigest.getInstance("MD5");

            while ((bytesRead = fioj.read(Buffer)) != -1)
            {
                md.update(Buffer, 0, bytesRead);
            }

            byte[] checksum = md.digest();

            System.out.print("Checksum (MD5): ");
            for (byte b : checksum)
            {
                System.out.printf("%02x", b);
            }

            fioj.close();
            sobj.close();
       
    }
}
