// // 1  *  2  *  3  *  4  *  5  *
class Aadi
{
   public void Display()
   {
       int iCnt = 0;

       for(iCnt = 1; iCnt <= 5; iCnt++)
       {
         System.out.print("\t"+iCnt+"\t*");
       }
   }
}

class DigitStar1
{
   public static void main(String A[])
   {
      
      Aadi aobj = new Aadi();

      aobj.Display();
   }
}