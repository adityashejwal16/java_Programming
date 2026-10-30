import java.util.*;


class Display
{
   int DisplayDigits(int iNo)
    {
        int iDigit = 0;
        int iSum = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iSum = iSum + iDigit;
            iNo = iNo / 10;
        }

        return iSum;

    }
}

class Sumofdigit
{
    public static void main(String A[])
    {
        int iValue = 0, iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number : ");
        iValue = sobj.nextInt();

        Display dobj = new Display();

        iRet = dobj.DisplayDigits(iValue);

        System.out.println("Sum of digit is : " +iRet);

        sobj = null;
        dobj = null;

        System.gc();

    }
}