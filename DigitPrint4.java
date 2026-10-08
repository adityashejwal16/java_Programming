import java.util.*;
// Input 10
// 3    5   7   9   

class Digit
{
   public void Display(int iNo)
   {
      int iCnt = 0;

      for(iCnt = 2; iCnt <= iNo; iCnt++)
      {
         if((iCnt % 2) != 0)
         {
            System.out.print("\t"+iCnt);
         }
      }
   }
}

// Time Complexity : O(N/2)

class DigitPrint4
{
   public static void main(String A[])
   {
      int iValue = 0;

       Digit dobj = new Digit();

      Scanner sobj = new Scanner(System.in);

      System.out.println("Enter the frequency : ");
      iValue = sobj.nextInt();

      dobj.Display(iValue);
   }
}