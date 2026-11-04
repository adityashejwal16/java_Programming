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

class Array17
{
    public static void main(String A[])
    {
        int iSize = 0;
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the Elements : ");
        iSize = sobj.nextInt();

        int Arr[] = new int[iSize];

        Arr[0] = sobj.nextInt();
        Arr[1] = sobj.nextInt();
        Arr[2] = sobj.nextInt();
        Arr[3] = sobj.nextInt();
        Arr[4] = sobj.nextInt();

        ArrayX aobj = new ArrayX();

        iRet = aobj.Display(Arr);
        System.out.println("Addition is : "+iRet);
    }
}