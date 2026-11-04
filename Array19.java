import java.util.*;

// Maximum Element

class ArrayX
{
    public void Display(int Brr[])
    {
        int i = 0, iMax = Brr[0];

        System.out.println("Total Elements Are : "+Brr.length);

        for(i = 0; i < Brr.length; i ++)
        {
            if(Brr[i] > iMax)
            {
                iMax = Brr[i];
            }
        }

        System.out.println("Maximum element is  :"+iMax);
    }
}

class Array19
{
    public static void main(String A[])
    {
        int iRet = 0, iSize = 0; 

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter The Size of Element :");
        iSize = sobj.nextInt();

        int Arr[] = new int[iSize];

        int j = 0;

        for(j = 0; j < Arr.length; j++)
        {
            Arr[j] = sobj.nextInt();
        }

        ArrayX aobj = new ArrayX();

        aobj.Display(Arr);
    }
}