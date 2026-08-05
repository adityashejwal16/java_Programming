import java.util.Scanner;

class Bitwise5
{
    public static void main(String A[])
    {
        int iNo = 0, iMask = 0, iResult =0;
        Scanner sobj = new Scanner(System.in);

       System.out.println("Enter Number");
        iNo = sobj.nextInt();

        
        //iMask = (1 << 0) | (1 << 31);
        iMask = 0x8000001;

        iResult = iNo & iMask;

        if (iResult == iMask)
        {
            System.out.println("First and Last bits are ON");
        }
        else
        {
            System.out.println("First and Last bits are ON");
        }
    }
}
