import java.util.Scanner;

class Bitwise3
{
    public static void main(String A[])
    {
        int iNo = 0, iMask = 0, iResult =0;
        Scanner sobj = new Scanner(System.in);

       System.out.println("Enter Number");
        iNo = sobj.nextInt();

        
        //iMask = (1 << 6) | (1 << 14) | (1 << 20) | (1 << 27);
        iMask = 0x8104040;

        iResult = iNo & iMask;

        if (iResult == iMask)
        {
            System.out.println("7th and 15th  Or 21st and 28th bits are ON");
        }
        else
        {
            System.out.println("7th and 15th  Or 21st and 28th bits are ON");
        }
    }
}
