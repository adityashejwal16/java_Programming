import java.util.*;

class CheckBitOnOff
{
    public static boolean ChkBit(int iNo)
    {
        int mask1  = 1 << 8;   // 9th bit
        int mask2 = 1 << 11;  // 12th bit

        if((iNo & mask1) != 0 || (iNo & mask2) != 0)
        {
             return true;
        }
        else
        {
              return false;
        }
           
    }
    public static void main(String A[] )
    {
         Scanner sobj = new Scanner(System.in);
         System.out.print("\nEnter number : ");
        int chk = sobj.nextInt();

        if(ChkBit(chk))
        {
            System.out.println("TRUE");
        }
        else
        {
            System.out.println("FALSE");
        }    
       
    }    
}    

