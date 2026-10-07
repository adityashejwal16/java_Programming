//    1   2   3   4   5
/*
   Now using  for loop
*/


class Aadi
{
   public void Display()
   {
       int iCnt = 0;

       for(iCnt = 1; iCnt <= 5; iCnt++)
       {
         System.out.print("\t"+iCnt);  // IMP use print Only Display Something line 
       }
   }
}

class Print_Digit2
{
   public static void main(String A[])
   {
      Aadi aobj = new Aadi();

      aobj.Display();
   }
}