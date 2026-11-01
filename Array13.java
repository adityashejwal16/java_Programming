import java.util.*;

// OOP Design

class ArrayX
{
    public int Arr[];
    public int iSize;

    public ArrayX(int no)
    {
        System.out.println("Inside Constructor");

        iSize = no;
        Arr = new int[iSize];
    } 

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);

        int i = 0;

        System.out.println("Enter the Elements of array : ");

        for(i = 0; i < Arr.length; i++)
        {
            Arr[i] = sobj.nextInt();
        }
    }

    public void Display()
    {
        System.out.println("Element of that array are : ");
        int i = 0;

        for(i = 0; i < Arr.length; i++)
        {
            System.out.println(Arr[i]);
        }
    }

    public float Average()
    {
        int i = 0, iSum = 0;

        for(i = 0; i < Arr.length; i++)
        {
            iSum = iSum + Arr[i];
        }

        return (iSum / iSize);
    }
} // End Of ArrrayX class

class Array13
{
    public static void main(String A[])
    {
        float fRet = 0.0f;

        ArrayX aobj1 = new ArrayX(5);
        aobj1.Accept();
        aobj1.Display();

        fRet = aobj1.Average();

        System.out.println("Average is : "+fRet);
    }
}