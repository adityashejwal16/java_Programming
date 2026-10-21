import java.util.*;

class AadiX
{
    int Sumofdigit(int iNo)
    {
        int iSum = 0, iDigit = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iNo = iNo / 10;
            iSum = iSum + iDigit;
        }

        return iSum;
    }
}

class SumdigitXX
{
    public static void main(String A[])
    {
        AadiX aobj = new AadiX();

        int iValue = 0, iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number : ");
        iValue = sobj.nextInt();

        iRet = aobj.Sumofdigit(iValue);

        System.out.println("Sum of digit is : " + iRet);
    }
}