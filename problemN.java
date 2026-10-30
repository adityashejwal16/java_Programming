import java.util.*;

// Input : 5
// Output : 5 * 4 * 3 * 2 * 1 = 120

class Display
{
    public int calculatefactor(int iNo)
    {
        int iFact = 1;

        for(int i = 1; i <= iNo; i++)
        {
            iFact = iFact * i;
        }

        return iFact;
    }
}

class problemN
{
    public static void main(String A[])
    {
        int iValue = 0, iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter your number : ");
        iValue = sobj.nextInt();

        Display dobj = new Display();
        iRet = dobj.calculatefactor(iValue);

        System.out.println("Factorial is : " +iRet);

        sobj=null;
        dobj=null;

        System.gc();

    }
}