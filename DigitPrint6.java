import java.util.*;

class Math
{
   public boolean Display(int iNo1, int iNo2)
   {
      if((iNo1 % iNo2) == 0)
      {
         return true;
      }
      else
      {
         return false;
      }
   }
}

class DigitPrint6
{
   public static void main(String A[])
   {
      int iValue1 = 0, iValue2 = 0;

      Math mobj = new Math();

      Scanner sobj = new Scanner(System.in);

      System.out.println("Enter the First Number :");
      iValue1 = sobj.nextInt();

      System.out.println("Enter The Secound Number : ");
      iValue2 = sobj.nextInt();

       boolean bRet = mobj.Display(iValue1, iValue2);

      if(bRet == true)
      {
         System.out.println("It is Complate Divisible");
      }
      else
      {
         System.out.println("it is Not Divisible");
      }
      
   }
}