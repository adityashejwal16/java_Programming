import java.util.*;

class Display
{
    int Countdigits(int iNo)
    {
        int iDigit = 0;
        int iCount = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iNo = iNo / 10;
            iCount++;
        }

        return iCount;
    }
}

class CountDigit
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