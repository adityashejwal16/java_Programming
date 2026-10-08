// Input 10
// 2    4   6   8   10

class Digit
{
   public void Display(int iNo)
   {
      int iCnt = 0;

      for(iCnt = 2; iCnt <= iNo; iCnt += 2)
      {
         System.out.print("\t"+iCnt);
      }
   }
}

// Time Complexity : O(N/2)

class DigitPrint2
{
   public static void main(String A[])
   {
      Digit dobj = new Digit();

      dobj.Display(10);
   }
}