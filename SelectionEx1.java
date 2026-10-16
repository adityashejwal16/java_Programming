import java.util.*;

class SelectionEx1
{
    public static void main(String A[])
    {
       Scanner sobj = new Scanner(System.in);

       int Std = 0;

       System.out.println("Enter Your Standerd");
       Std = sobj.nextInt();

       if(Std == 1)
       {
         System.out.println("your Exam At 9 AM");
       }
       else if(Std == 2)
       {
         System.out.println("Your Exam At 10 AM");
       }
       else if(Std == 3)
       {
         System.out.println("Your Exam At 12 PM");
       }
       else if(Std == 5)
       {
          System.out.println("Your Exam At 3 AM");
       }
       else if(Std == 4)
       {
         System.out.println("Your Exam At 5 AM");
       }
       else
       {
         System.out.println("Invalid Input");
       }
       
    }
}