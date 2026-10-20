import java.util.*;

// [ / 10 ] use to remove last digit

class Display
{
    int Countdigits(int iNo)
    {
        int iDigit = 0;
        int iCount = 0;

        while(iNo != 0)  // 7684
        {
            iNo = iNo / 10; //use to remove last digit
            iCount++;
        }

        return iCount;
    }
}

class CountDigitX
{
    public static void main(String A[])
    {
        int iValue = 0, iRet = 0;

        Display dobj = new Display();

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number : ");
        iValue = sobj.nextInt();

        iRet = dobj.Countdigits(iValue);

        System.out.println("The total number of : " + iRet);

    }
}