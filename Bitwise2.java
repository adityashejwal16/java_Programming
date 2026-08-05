import java.util.Scanner;

class Bitwise2
{
    public static void main(String A[])
    {
        int iNo = 0, iMask = 0, iResult =0;
        Scanner sobj = new Scanner(System.in);

       System.out.println("Enter Number");
        iNo = sobj.nextInt();

        // 5th bit (1 << 4) and 18th bit (1 << 17)
        iMask = (1 << 4) | (1 << 17);

        iResult = iNo & iMask;

        if (iResult == iMask)
        {
            System.out.println("5th and 18th bits are ON");
        }
        else
        {
            System.out.println("5th and 18th bits are OFF");
        }
    }
}
