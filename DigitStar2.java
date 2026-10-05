//  1    2    3    4    5  
class Aadi
{
   public void Display(int iNo)
   {
       int iCnt = 0;

       for(iCnt = 1; iCnt <= iNo; iCnt++) // logic
       {
         System.out.print("\t"+iCnt);
       }
   }
}

class DigitStar2
{
   public static void main(String A[])
   {
      
      Aadi aobj = new Aadi(); // class object

      aobj.Display(8); // use thes withount giving input on console
   }
}