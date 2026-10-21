import java.util.*;


class Printting1
{
    public static void main(String A[])
    {
        int iNo = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number : ");
        iNo = sobj.nextInt();

        
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