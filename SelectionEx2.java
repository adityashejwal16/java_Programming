import java.util.*;

class SelectionEx2
{
    public static void main(String A[])
    {
       Scanner sobj = new Scanner(System.in);

       int Std = 0;

       System.out.println("Enter Your Age");
       Std = sobj.nextInt();

       if(Std >= 18)
       {
         System.out.println("You Can vote");
       }
       else
       {
         System.out.println("You Can't vote");
       }
    }
}