//import java.util.Scanner;
import java.util.*;

class Dynamic1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int length = 0;
        int Arr[];

        System.out.println("Enter the number of element : ");
        length = sobj.nextInt();

        Arr = new int[length];

        if(Arr == null)
        {
            System.out.println("Unable to Allocate memory");
        }
        else
        {
             System.out.println("Memory gets succesfully allocated");
        }

        Arr = null;
        System.gc();
    }
}