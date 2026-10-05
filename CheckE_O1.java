import java.util.*;

/*

     START 
          Accept number and store as no
          Divide no by 2
          if the remainder is 0
                then display as Even
         Otherwise
                 display as Odd
      STOP
 */

class Marvellous
{
   public void CheckEvenOdd(int iNo)
   {
      int iRem = 0;

      iRem = iNo % 2;

      if(iRem == 0)
      {
         System.out.println("its Even Number");
      }
      else
      {
         System.out.println("its Odd Number");
      }
   }
}

class CheckE_O1
{
   public static void main(String A[])
   {
      
      int iValue = 0;

      Marvellous mobj = new Marvellous();

      Scanner sobj = new Scanner(System.in);

      System.out.println("Enter the Number : ");
      iValue = sobj.nextInt();

      mobj.CheckEvenOdd(iValue); 
   }
}