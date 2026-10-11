import java.util.*;



// Wrong Approach

class Factor
{
   void Display(int iNo)
   {
      if((iNo % 1) == 0)
      {
         System.out.println("1");
      }
      if((iNo % 2) == 0)
      {
         System.out.println("2");
      }
      if((iNo % 3) == 0)
      {
         System.out.println("3");
      }
      if((iNo % 4) == 0)
      {
          System.out.println("4");
      }
      if((iNo % 5) == 0)
      {
         System.out.println("5");
      }
      if((iNo % 6) == 0)
      {
         System.out.println("6");
      }
   }
}

class Factor_1
{
   public static void main(String A[])
   {
      int iValue = 0;

      Factor fobj = new Factor();

      Scanner sobj = new Scanner(System.in);

      System.out.println("Enter the Number : ");
      iValue = sobj.nextInt();

      fobj.Display(iValue);
   }
}