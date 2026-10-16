import java.util.*;

/* Suppose in collage there are 30 student
   and only 15 student is pass 
   there roll NO
   15std are pass only 

*/

class Student 
{
   void Display(int iTotalstd)
   {
      int iCnt = 0;

      for(iCnt = 1; iCnt <= iTotalstd; iCnt ++)
      {
         if(iCnt <= 15)
         {
            System.out.println("Pass" + iCnt);
         }
         else
         {
            System.out.println("Fail" + iCnt);
         }
      }
   }
}

class Collage
{
   public static void main(String A[])
   {
      Student aobj = new Student();

      int iValue = 0;

      Scanner sobj = new Scanner(System.in);

      System.out.println("Enter You Roll No : ");
      iValue = sobj.nextInt();

      aobj.Display(iValue);

   }
}