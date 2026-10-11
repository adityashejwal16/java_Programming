import java.lang.*;
import java.util.*;


class CheckPrime
{
   boolean Display(int iNo)
   {
      int iCnt = 0;

      for(iCnt = 2; iCnt <= (iNo / 2); iCnt++)
      {
         if((iNo % iCnt) == 0)
         {
            break;  // Optimization 
         }
      }

      if(iCnt > (iNo / 2))     // Non Factor
      {
         return true;
      }
      else                    // Atlist One Factor 
      {
         return false;
      }
   }
}

class Prime3
{
   public static void main(String A[])
   {
      int iValue = 0; 
      boolean bRet = false;

      CheckPrime mobj = new CheckPrime();

      Scanner sobj = new Scanner(System.in);

      System.out.println("ENter The Number : ");
      iValue = sobj.nextInt();

      bRet = mobj.Display(iValue);

      if(bRet == true)
      {
         System.out.println("its A prime number : " + iValue);
      }
      else
      {
         System.out.println("Its Not a Prime Nhumber : "+ iValue);
      }  
   }
}