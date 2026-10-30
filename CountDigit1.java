import java.util.*;


class Display
{
    void DisplayDigits(int iNo)
    {
        int iDigit = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            System.out.println(iDigit);
            iNo = iNo / 10;
        }

    }
}

class CountDigit1
{
    public static void main(String A[])
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number : ");
        iValue = sobj.nextInt();

        Display dobj = new Display();

        dobj.DisplayDigits(iValue);

        sobj = null;
        dobj = null;

        System.gc();

    }
}