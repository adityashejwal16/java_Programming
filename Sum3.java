
import java.util.Scanner;


class Sum3
{
    public static void main(String A[])
    {
        int a = 0, b = 0, iRet = 0; 
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter First Number :");
        a = sobj.nextInt();

        System.out.println("Enter Secound Number :");
        b = sobj.nextInt();

        iRet = a + b;

        System.out.println("Summation is : "+iRet);


    }
}