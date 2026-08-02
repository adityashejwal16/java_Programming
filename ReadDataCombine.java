import java.io.*;

// Read 1kb in the file
class ReadDataCombine
{
    public static void main(String A[]) throws Exception
    {
        FileInputStream fis = new FileInputStream("Combined.bin");
        FileOutputStream fos = new FileOutputStream("Output.bin");

        byte buffer[] = new byte[1024];   // 1 KB

        int size = fis.read(buffer);

        if(size > 0)
        {
            fos.write(buffer,0,size);
        }

        fis.close();
        fos.close();

        System.out.println("First 1KB copied to Output.bin");
    }
}