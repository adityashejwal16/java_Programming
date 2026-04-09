import java.io.File;
import java.io.IOException;

class File1
{
    public static void main(String A[])
    {
        try
        {
            File fobj = new File("PPA.txt");

            if(fobj.createNewFile())
            {
                System.out.println("File Successfully Created");
            }
            else
            {
                System.out.println("File Already Exists");
            }
        }
        catch(IOException e)
        {
            System.out.println("Unable to Create File");
        }
    }
}
