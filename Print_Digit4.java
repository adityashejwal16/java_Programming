//    1  2  3  4  5
/*
   Now using while loop
*/


class Aadi
{
   public void Display()
   {
       int iCnt = 1;

       while(iCnt <= 5)
       {
          System.out.print("\t"+iCnt);
          iCnt++;
       }
   }
}

class Print_Digit4
{
   public static void main(String A[])
   {
      Aadi aobj = new Aadi();

      aobj.Display();
   }
}