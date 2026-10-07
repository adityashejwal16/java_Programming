//    5  4  3  2  1
/*
   Now using for loop
*/


class Aadi
{
   public void Display()
   {
       int iCnt = 0;

       for(iCnt = 5; iCnt >= 1; iCnt--)
       {
         System.out.print("\t"+iCnt);  // IMP use print Only Display Something line 
       }
   }
}

class Print_Digit3
{
   public static void main(String A[])
   {
      Aadi aobj = new Aadi();

      aobj.Display();
   }
}