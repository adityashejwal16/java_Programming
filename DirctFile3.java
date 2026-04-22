import java.io.*;
import java.util.*;

class DirectFile3
{
    public static void main(String A[]) 
    {
        String Dir = null;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter The Directory Name :");
        Dir = sobj.nextLine();

        File dobj = new File(Dir);

        if(dobj.exists() &&dobj.isDirectory())
        {
            System.out.println("It is a Sub-Directory");
        }
        else
        {
            System.out.println("Is not Sub-Directory");
        }

        sobj.close();
    }
}