import java.io.*;
import java.util.*;

class DirectFile1
{
    public static void main(String A[]) 
    {
        String Dir = null;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter The Directory Name :");
        Dir = sobj.nextLine();

        File dobj = new File(Dir);

        if(dobj.exists())
        {
            System.out.println("Directory is present");

            File fArr[] = dobj.listFiles();

            System.out.println("Number of files in Directory :"+fArr.length);

             for(int i = 0; i < fArr.length; i++)
            {
                System.out.println("File name : "+fArr[i].getName());
            }
        }
        else
        {
            System.out.println("There Is no such directory");
        }

        sobj.close();
    }
}