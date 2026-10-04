import java.util.*;

class arithmatics2    
{
   public static void main(String[] A) 
   {
       int a = 0, b = 0;  

       System.out.println("Enter the first Number :");
       Scanner sobj = new Scanner(System.in);
       a = sobj.nextInt();


       System.out.println("Enter the Seound Number : ");
       Scanner dobj = new Scanner(System.in);
       b = dobj.nextInt();

       int iRet  = a + b;
     
       System.out.println("Addition is " + iRet); 
   }
}