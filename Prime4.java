import java.lang.*;
import java.util.*;


class CheckPrime
{
   boolean Display(int iNo)
   {
      int iCnt = 0;
      boolean bFlag = true;

      if(iNo < 0)
      {
         iNo = -iNo;
      }

      for(iCnt = 2; iCnt <= (iNo / 2); iCnt++)
      {
         if((iNo % iCnt) == 0)
         {
            bFlag = false;
            break;  // Optimization 
         }
      }
      return bFlag;
   }
   
}

class Prime4
{
   public static void main(String A[])
   {
      int iValue = 0; 
      boolean bRet = false;

      CheckPrime mobj = new CheckPrime();

      Scanner sobj = new Scanner(System.in);

      System.out.println("Enter The Number : ");
      iValue = sobj.nextInt();

      bRet = mobj.Display(iValue);

      if(bRet == true)
      {
         System.out.println("Its a prime number : " + iValue);
      }
      else
      {
         System.out.println("Its Not a Prime Nhumber : "+ iValue);
      }  
   }
}