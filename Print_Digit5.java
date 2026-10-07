//    5  4  3  2  1
/*
   Now using while loop
*/


class Aadi
{
   public void Display()
   {
       int iCnt = 5;

       while(iCnt >= 1)
       {
          System.out.print("\t"+ iCnt);
          iCnt--;
       }
   }
}

class Print_Digit5
{
   public static void main(String A[])
   {
      Aadi aobj = new Aadi();

      aobj.Display();
   }
}