import java.util.*;


// Non Factor of 6


class Factor
{
   void Display(int iNo)
   {
      int iCnt = 0;

      if(iNo < 0)
      {
         iNo = -iNo;
      }

      for(iCnt = 1; iCnt < (iNo / 2); iCnt++)
      {
         if((iNo % iCnt) == 0)
         {
            System.out.println("Factor is :" + iCnt);
         }
      }
   }
}

    // Time Complexity : O(N / 2)

class Factor_5
{
   public static void main(String A[])
   {
      int iValue = 0;

      Factor fobj = new Factor();

      Scanner sobj = new Scanner(System.in);

      System.out.println("Enter the Number : ");
      iValue = sobj.nextInt();

      fobj.Display(iValue);
   }
}