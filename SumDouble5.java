import java.util.Scanner;


class SumDouble5
{
    public static void main(String A[]) 
    {
        double a = 0.00, b = 0.00, iRet = 0.00; 
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter First Number :");
        a = sobj.nextDouble();

        System.out.println("Enter Secound Number :");
        b = sobj.nextDouble();

        iRet = a + b;

        System.out.println("Summation is : "+iRet);


    }
}