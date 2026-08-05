
import java.util.Scanner;


class Bitwise1
{
    public static void main(String A[])
    {
        int iNo = 0, iMask = 0, iResult =0;
        Scanner sobj = new Scanner(System.in);

       System.out.println("Enter Number");
        iNo = sobj.nextInt();

        iMask = 0x00004000;

        iResult = iNo & iMask;


       if(iResult == iMask)
       {
           System.out.println("15th Bit is On");
       }
       else
       {
           System.out.println("15th Bit is off");
       }
    }
}
