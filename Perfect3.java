import java.util.*;

class Aadix
{
    public boolean CheckPerfect(int iNo)
    {
        int i = 0, iSum = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        for(i = iNo/2; (i >= 1) && (iSum < iNo); i--)
        {
            if((iNo % i) == 0)
            {
                iSum = iSum + i;
            }
        }

        return (iSum == iNo);  // change
    }
}

class Perfect3
{
    public static void main(String A[])
    {
        Aadix aobj = new Aadix();

        boolean bRet = false;

        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        bRet = aobj.CheckPerfect(iValue);

        if(bRet == true)
        {
            System.out.println(iValue + " is a perfect number");
        }
        else
        {
            System.out.println(iValue + " is Not a Perfect number");
        }

        sobj = null;
        aobj = null;

        System.gc();
    }
}