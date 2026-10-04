import java.util.*;

class arithmatics3    
{
   public static void main(String[] A) 
   {
       float a = 0.0f, b = 0.0f;  

       System.out.println("Enter the first Number :");
       Scanner sobj = new Scanner(System.in);
       a = sobj.nextFloat();


       System.out.println("Enter the Seound Number : ");
       Scanner dobj = new Scanner(System.in);
       b = dobj.nextFloat();

       float iRet  = a + b;
     
       System.out.println("Addition is " + iRet); 
   }
}