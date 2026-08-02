import java.io.*;

class CopyStramBuffer
{
    public static void main(String A[]) throws Exception
    {
        long start, end;

        // Normal stream
        FileInputStream fis = new FileInputStream("input.txt");
        FileOutputStream fos = new FileOutputStream("normal.txt");

        start = System.currentTimeMillis();

        int data;
        while((data = fis.read()) != -1)
        {
            fos.write(data);
        }

        end = System.currentTimeMillis();
        System.out.println("Normal Stream Time : "+(end-start)+" ms");

        fis.close();
        fos.close();

        // Buffered stream
        BufferedInputStream bis =
            new BufferedInputStream(new FileInputStream("input.txt"));
        BufferedOutputStream bos =
            new BufferedOutputStream(new FileOutputStream("buffered.txt"));

        start = System.currentTimeMillis();

        byte buffer[] = new byte[1024];
        int size;
        while((size = bis.read(buffer)) != -1)
        {
            bos.write(buffer,0,size);
        }

        bis.close();
        bos.close();

        end = System.currentTimeMillis();
        System.out.println("Buffered Stream Time : "+(end-start)+" ms");
    }
}