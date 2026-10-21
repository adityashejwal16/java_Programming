import java.util.*;

class Aadix
{
    public void DisplayFactor(int iNo)
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

class FactorPrint1
{
    public static void main(String A[])
    {
        Aadix aobj = new Aadix();

        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        aobj.DisplayFactor(iValue);
    }
}