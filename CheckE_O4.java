import java.lang.*;
import java.util.*;


class Marvellous
{
   public Boolean CheckEvenOdd(int iNo)
   {
   
      if(iNo % 2 == 0)
      {
        return true;
      }
      else
      {
         return false;
      }
   }
}

class CheckE_O4
{
   public static void main(String A[])
   {
      int iValue = 0;
      boolean bRet = false;

      Marvellous mobj = new Marvellous();

      Scanner sobj = new Scanner(System.in);

      System.out.println("Enter the number : ");
      iValue = sobj.nextInt();

      bRet = mobj.CheckEvenOdd(iValue);

      if(bRet == true)
      {
         System.out.println("Its a Even number");
      }
      else
      {
         System.out.println("Its a Odd number");
      }
      
   }
}