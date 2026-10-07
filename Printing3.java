import java.util.*;

// Using While loop 

class Marvellous
{
   public void Display(int Frequency)
   {
      int iCnt = 1;

      while(iCnt <= Frequency)
      {
         System.out.println("Jay Ganesh..");
         iCnt++;
      }
   }
}
class Printing3
{
   public static void main(String A[])
   {
      int iValue = 0;

       Marvellous mobj = new Marvellous();

       Scanner sobj = new Scanner(System.in);

       System.out.println("enter the frequency : ");
       iValue = sobj.nextInt();

       mobj.Display(iValue);
   }
}