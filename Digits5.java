import java.util.*;

class Display
{
    void DisplayDigit(int iDigit)
    {
        int iNo = 0;

        while(iDigit != 0)
        {
            iNo = iDigit % 10;
            System.out.println(iNo);
            iDigit = iDigit / 10;
            
            System.out.println(iDigit);
        }
    }

}

class Digits5
{
    public static void main()
    {
        int iValue = 0;

        Display dobj = new Display();

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        dobj.DisplayDigit(iValue);
    } 
}