import java.util.*;

class Aadix
{
    public boolean CheckPerfect(int iNo)
    {
        int i = 0;

        for(i = 1; i <= (iNo / 2); i++)
        {
            if((iNo % i) == 0)
            {
                System.out.println(i);
            }
        }
    }
}

class FactorPrint3
{
    public static void main(String A[])
    {
        Aadix aobj = new Aadix();

        boolean bRet = false;

        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        aobj.CheckPerfect(iValue);

        if(bRet = true)
        {
            System.out.println(iValue + " its a perfect number");
        }
        else
        {
            System.out.println(iValue + " its Not a Perfect number ");
        }

        sobj = null;
        aobj = null;

        System.gc();
    }
}