import java.util.*;

// 1  2  3  4  5  6  7  8  3  N times 

class Aadi
{
   public void Display(int iNo)
   {
       int iCnt = 0;

       for(iCnt = 1; iCnt <= iNo; iCnt++)
       {
         System.out.print("\t"+iCnt);
       }
   }
}

class Print_Digit7
{
   public static void main(String A[])
   {
      int iValue = 0;
      
      Aadi aobj = new Aadi();

      Scanner sobj = new Scanner(System.in);

      System.out.println("Enter The Number : ");
      iValue = sobj.nextInt();


      aobj.Display(iValue);
   }
}