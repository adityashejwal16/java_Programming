import java.util.*;


class ArrayX
{
    public void Display(int Brr[])
    {
        int i = 0;

        for(i = 0; i < Brr.length; i++)
        {
            System.out.println(Brr[i]);
        }
    }
}

class Array9
{
    public static void main(String A[])
    {
        int iSize = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter The Size Of Array : ");
        iSize = sobj.nextInt();

        int Arr[] = new int[iSize];

        System.out.println("Enter the element :");

        int i = 0;

        for(i = 0; i < Arr.length; i++)
        {
            Arr[i] = sobj.nextInt();
        }

        ArrayX aobj = new ArrayX();

        aobj.Display(Arr);

        // import

        aobj = null;
        Arr = null;
        sobj = null;

        System.gc();

    }
}