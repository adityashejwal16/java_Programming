import java.util.*;

class arithmatics3    
{
   public static void main(String[] A) 
   {
       double a = 0.0d, b = 0.0d;  

       System.out.println("Enter the first Number : ");
       Scanner sobj = new Scanner(System.in);
       a = sobj.nextDouble();


       System.out.println("Enter the Seound Number : ");
       Scanner dobj = new Scanner(System.in);
       b = dobj.nextDouble();

       Double iRet  = a + b;
     
       System.out.println("Addition is " + iRet); 
   }
}