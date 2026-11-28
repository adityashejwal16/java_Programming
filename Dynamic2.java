import java.util.Scanner;

class Dynamic2
{
    public static void main(String A[])
    {
        int length = 0;
        int Arr[];

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of element : ");
        length = sobj.nextInt();

        Arr = new int[length]; // using new keyword memory gets allocated inside heap 

        if(Arr == null)
        {
            System.out.println("Unable to get memory allocation");
        }
        else
        {
            System.out.println("Memory gets succesfully allocated");

        }

        Arr = null;
        System.gc();

    }
}
