

class Digit
{
   public void Display(int iNo)
   {
      int iCnt = 0;

      for(iCnt = 2; iCnt <= iNo; iCnt=iCnt+2)
      {
         System.out.print("\t"+iCnt);
      }
   }
}


class DigitPrint1
{
   public static void main(String A[])
   {
      Digit dobj = new Digit();

      dobj.Display(10);
   }
}