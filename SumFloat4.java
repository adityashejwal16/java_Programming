import java.util.Scanner;


class SumFloat4
{
    public static void main(String A[]) 
    {
        float a = 0.0f, b = 0.0f, iRet = 0.0f; 
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter First Number :");
        a = sobj.nextFloat();

        System.out.println("Enter Secound Number :");
        b = sobj.nextFloat();

        iRet = a + b;

        System.out.println("Summation is : "+iRet);


    }
}