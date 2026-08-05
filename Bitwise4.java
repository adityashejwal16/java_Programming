import java.util.Scanner;

class Bitwise4
{
    public static void main(String A[])
    {
        int iNo = 0, iMask = 0, iResult =0;
        Scanner sobj = new Scanner(System.in);

       System.out.println("Enter Number");
        iNo = sobj.nextInt();

        
        iMask = (1 << 6) | (1 << 7) | (1 << 8);
        //iMask = 0x8104040;

        iResult = iNo & iMask;

        if (iResult == iMask)
        {
            System.out.println("7th and 8th Or 9th bits are ON");
        }
        else
        {
            System.out.println("7th and 8th Or 9th bits are ON");
        }
    }
}
