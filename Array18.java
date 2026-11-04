import java.util.*;


class ArrayX
{
    public int Display(int Brr[])
    {
        int i = 0, iSum = 0;

        System.out.println("Total Elements Are : "+Brr.length);

        for(i = 0; i < Brr.length; i++)
        {
            System.out.println(Brr[i]);
            iSum = iSum + Brr[i];
        }
        return iSum;
    }
}

class Array18
{
    public static void main(String A[])
    {
        int iSize = 0;
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the Elements : ");
        iSize = sobj.nextInt();

        int Arr[] = new int[iSize];

        int i = 0;

        for(i = 0; i < Arr.length; i++)
        {
            Arr[i] = sobj.nextInt();
        }

        ArrayX aobj = new ArrayX();

        iRet = aobj.Display(Arr);
        System.out.println("Addition is : "+iRet);

        aobj=null;
        sobj=null;
        Arr=null;
    }
}