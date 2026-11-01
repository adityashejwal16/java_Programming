import java.util.*;


class ArrayX
{
    public void Display(int Brr[])
    {
        int i = 0;

        System.out.println("Element of that array :");

        for(i = 0; i < Brr.length; i++)
        {
            System.out.println(Brr[i]);
        }
    }

    public int countEven(int Brr[])
    {
        int i = 0, iCount = 0;

        for(i = 0; i < Brr.length; i++)
        {
            if((Brr[i] % 2 ) == 0)
            {
                iCount++;
            }
        }

        return iCount;
    }
}

class Array10
{
    public static void main(String A[])
    {
        int iSize = 0;  int iRet = 0;

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
        
        iRet = aobj.countEven(Arr);
        System.out.println("Even Elements Are : "+iRet);

        aobj.Display(Arr);

        // import

        aobj = null;
        Arr = null;
        sobj = null;

        System.gc();

    }
}