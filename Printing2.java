import java.util.*;


// Using for loop

class Marvellous
{
   public void Display(int Frequency)
   {
      int iCnt = 0;

      for(iCnt = 1; iCnt <= Frequency; iCnt++)
      {
         System.out.println("Jay Ganesh...");
      }
   }
}
class Printing2
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