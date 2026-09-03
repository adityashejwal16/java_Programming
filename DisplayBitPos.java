import java.util.*;

class DisplayBitPos
{
    public static void CommonBits(int iNo1, int iNo2)
    {
        int result = iNo1 & iNo2;
        int pos = 1;

        while(result != 0)
        {
            if((result & 1) == 1)
            {
                System.out.println(pos);
            }
            result = result >> 1;
            pos++;
        }
    }
    public static void main(String A[] )
    {
         Scanner sobj = new Scanner(System.in);

         int iRet = 0;

        System.out.print("\nEnter first number : ");
        int NO1 = sobj.nextInt();

        System.out.print("Enter second number : ");
        int NO2 = sobj.nextInt();

        System.out.println("Common ON bit positions :");

        CommonBits(NO1, NO2);
    }    
}    

