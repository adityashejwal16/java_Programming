import java.util.*;

// Count even and odd numbers in an array.

class ArrayX
{
    public void CountEvenOdd(int Brr[])
    {
        int i = 0, iEven = 0, iOdd = 0;

        for(i = 0; i < Brr.length; i++)
        {
            if((Brr[i] % 2) == 0)
            {
                iEven++;
            }
            else
            {
                iOdd++;
            }
        }

        System.out.println("Total even Number : "+ iEven);
        System.out.println("Total Odd Number :"+ iOdd);
    }
}

class Array25
{
    public static void main(String A[])
    {
        int iSize = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Total Size of Array : ");
        iSize = sobj.nextInt();

        int Arr[] = new int[iSize];

        int i = 0;

        for(i = 0; i < Arr.length; i++)
        {
            Arr[i] = sobj.nextInt();
        } 

        ArrayX aobj = new ArrayX();

        aobj.CountEvenOdd(Arr);

        //import
        aobj = null;
        sobj = null;
    }
}